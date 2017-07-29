package com.firejq.web;

import com.firejq.entity.Record;
import com.firejq.service.RecordService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>Title: ${file_name}</p>
 * <p>Description: </p>
 *
 * @author <a href="mailto:firejq@outlook.com">firejq</a>
 * @date 2017/7/29
 */
@Controller
public class SSEController {

	@Autowired
	RecordService recordService;

	private int oldRecordHashCode = 0;

	private int newRecordHashCode = 0;

	@RequestMapping(value = "/sse", produces = "text/event-stream;charset=UTF-8")
	@ResponseBody
	public String push() {

		while (true) {
			//查询当前数据库的最新数据
			Record newRecord = recordService.queryLastest();
			newRecordHashCode = newRecord.hashCode();

//			System.out.println("当前的newRecordHashCode为【" + newRecordHashCode + "】,当前的oldRecordHashCode为【" + oldRecordHashCode + "】");

			if (newRecordHashCode == oldRecordHashCode) {
				//若与上次查询结果的各个数据值都相等，则等待2秒后重新查询
//				System.out.println("与上次相同");
				oldRecordHashCode = newRecordHashCode;

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				continue;

			} else {
				//若与上次查询结果的各个数据值不相等，则将目前的最新数据发送到客户端
				String jsonResult = new Gson().toJson(newRecord, Record.class);
				String returnData = "retry:5000\n" + "data:" + jsonResult + "\n\n";

				System.out.println("有新数据：【" + returnData + "】");

				oldRecordHashCode = newRecordHashCode;

				return returnData;

			}
		}
	}
}
