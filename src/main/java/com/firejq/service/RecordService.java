package com.firejq.service;

import com.firejq.entity.Record;

/**
 * Created by firejq on 2017/7/25.
 */
public interface RecordService {

	/**
	 * query the lastest record in the databases
	 * @return
	 */
	Record queryLastest();
}
