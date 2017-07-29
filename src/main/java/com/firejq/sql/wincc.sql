/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : wincc

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-29 22:15:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_1200
-- ----------------------------
DROP TABLE IF EXISTS `test_1200`;
CREATE TABLE `test_1200` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `auto_change_var_1` smallint(6) NOT NULL,
  `auto_change_var_2` smallint(6) NOT NULL,
  `auto_change_var_3` smallint(6) NOT NULL,
  `auto_change_var_4` smallint(6) NOT NULL,
  `auto_change_var_5` smallint(6) NOT NULL,
  `auto_change_var_6` smallint(6) NOT NULL,
  `auto_change_var_7` smallint(6) NOT NULL,
  `param_var_1` smallint(6) NOT NULL,
  `param_var_2` smallint(6) NOT NULL,
  `param_var_3` smallint(6) NOT NULL,
  `param_var_4` smallint(6) NOT NULL,
  `param_var_5` smallint(6) NOT NULL,
  `param_var_6` smallint(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81882 DEFAULT CHARSET=utf8;
