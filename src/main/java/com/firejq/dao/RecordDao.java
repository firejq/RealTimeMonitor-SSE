package com.firejq.dao;

import com.firejq.entity.Record;
import org.springframework.stereotype.Repository;

/**
 * Created by firejq on 2017/7/25.
 */
@Repository
public interface RecordDao {

	/**
	 * query the lastest record in the database
	 * @return
	 */
	Record queryLastest();

}
