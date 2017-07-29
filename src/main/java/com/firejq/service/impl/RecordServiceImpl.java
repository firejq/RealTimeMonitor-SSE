package com.firejq.service.impl;

import com.firejq.dao.RecordDao;
import com.firejq.entity.Record;
import com.firejq.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by firejq on 2017/7/25.
 */
@Service
public class RecordServiceImpl implements RecordService {

	@Autowired
	private RecordDao recordDao;

	@Override
	public Record queryLastest() {
		return recordDao.queryLastest();
	}
}
