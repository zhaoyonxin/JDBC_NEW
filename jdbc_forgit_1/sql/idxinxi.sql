-- 创建表"idxinxi"
CREATE TABLE IF NOT EXISTS `idxinxi` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `creat_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `qq` int(11) DEFAULT NULL,
  `xiuzhenstyle` varchar(50) DEFAULT NULL,
  `biyeschool` varchar(50) DEFAULT NULL,
  `xuehao` int(11) DEFAULT NULL,
  `ruxuetime` date DEFAULT NULL,
  `ribaolianjie` varchar(50) DEFAULT NULL,
  `zhiyuan` varchar(50) DEFAULT NULL,
  `tuijianren` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
-- 注入数据
INSERT IGNORE INTO `idxinxi` (`ID`, `creat_at`, `update_at`, `name`, `qq`, `xiuzhenstyle`, `biyeschool`, `xuehao`, `ruxuetime`, `ribaolianjie`, `zhiyuan`, `tuijianren`) VALUES
	(1, '2016-11-30 22:14:00', '2016-11-30 22:14:00', '小明', 592150879, '产品经理', '喵喵哒', 467, '2016-11-06', '也是真的', '真是可笑', '余量'),
	(2, '2016-11-01 14:25:00', '2016-11-01 14:25:00', '小李', 1147733717, '产品经理', '呵呵哒', 472, '2016-11-05', '我说的对', '哈哈哈哈', '聊聊'),
	(3, NULL, NULL, '小王', 5454781, '好吧', '家里蹲大学', 656244, NULL, '有何不可', '我勒个去', '我是好人'),
	(20, NULL, NULL, '小李子吱吱吱吱', 5454781, '好吧巴巴爸爸', '家里蹲大学啦啦啦', 656244, NULL, '有何不可', '我勒个去', '我是好人人人人'),
	(21, NULL, NULL, '小李子吱吱吱吱', 5454781, '好吧巴巴爸爸', '家里蹲大学啦啦啦', 656244, NULL, '有何不可', '我勒个去', '我是好人人人人'),
	(22, NULL, NULL, '小王', 5454781, '好吧', '家里蹲大学', 656244, NULL, '有何不可', '我勒个去', '我是好人'),
	(23, NULL, NULL, '小王', 5454781, '好吧', '家里蹲大学', 656244, NULL, '有何不可', '我勒个去', '我是好人'),
	(24, NULL, NULL, '小王', 5454781, '好吧', '家里蹲大学', 656244, NULL, '有何不可', '我勒个去', '我是好人'),
	(25, NULL, NULL, '小王', 5454781, '好吧', '家里蹲大学', 656244, NULL, '有何不可', '我勒个去', NULL),
	(26, NULL, NULL, '小王', 5454781, '好吧', '家里蹲大学', 656244, NULL, '有何不可', '我勒个去', '我是好人'),
	(27, NULL, NULL, '小王', 5454781, '好吧', '家里蹲大学', 656244, NULL, '有何不可', '我勒个去', '我是好人');