package com.firejq.service;

import com.firejq.BaseTest;
import com.firejq.entity.Record;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * <p>Title: ${file_name}</p>
 * <p>Description: </p>
 *
 * @author <a href="mailto:firejq@outlook.com">firejq</a>
 * @date 2017/7/29
 */
public class RecordServiceTest extends BaseTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Autowired
	RecordService recordService;

	@Test
	public void queryLastest() throws Exception {
		Record record = recordService.queryLastest();
		System.out.println(record.toString());
	}

}