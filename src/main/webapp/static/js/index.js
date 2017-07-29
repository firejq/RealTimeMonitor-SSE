/**
 * Created by firej on 2017/7/25.
 */
document.getElementById("info").innerHTML = "正在准备连接服务器……";

if (!"EventSource" in window) {
    alert("你的浏览器不支持SSE");
    window.close();
} else {
    var source = new EventSource("http://127.0.0.1:8080/sse");
    source.onopen = function (event) {
        document.getElementById("info").innerHTML = "连接成功！";
    };

    source.onclose = function (event) {//TODO 触发不了？
        document.getElementById("info").innerHTML = "连接断开！";

    };

    source.onmessage = function (event) {
        var record = JSON.parse(event.data);
        document.getElementById("id_v").innerHTML = record.id;
        document.getElementById("time_v").innerHTML = record.time;
        document.getElementById("var1_v").innerHTML = record.autoChangeVar1;
        document.getElementById("var2_v").innerHTML = record.autoChangeVar2;
        document.getElementById("var3_v").innerHTML = record.autoChangeVar3;
        document.getElementById("var4_v").innerHTML = record.autoChangeVar4;
        document.getElementById("var5_v").innerHTML = record.autoChangeVar5;
        document.getElementById("var6_v").innerHTML = record.autoChangeVar6;
        document.getElementById("var7_v").innerHTML = record.autoChangeVar7;
        document.getElementById("p_var1_v").innerHTML = record.paramVar1;
        document.getElementById("p_var2_v").innerHTML = record.paramVar2;
        document.getElementById("p_var3_v").innerHTML = record.paramVar3;
        document.getElementById("p_var4_v").innerHTML = record.paramVar4;
        document.getElementById("p_var5_v").innerHTML = record.paramVar5;
        document.getElementById("p_var6_v").innerHTML = record.paramVar6;

    };









}





