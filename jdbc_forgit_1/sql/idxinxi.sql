-- ������"idxinxi"
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
-- ע������
INSERT IGNORE INTO `idxinxi` (`ID`, `creat_at`, `update_at`, `name`, `qq`, `xiuzhenstyle`, `biyeschool`, `xuehao`, `ruxuetime`, `ribaolianjie`, `zhiyuan`, `tuijianren`) VALUES
	(1, '2016-11-30 22:14:00', '2016-11-30 22:14:00', 'С��', 592150879, '��Ʒ����', '������', 467, '2016-11-06', 'Ҳ�����', '���ǿ�Ц', '����'),
	(2, '2016-11-01 14:25:00', '2016-11-01 14:25:00', 'С��', 1147733717, '��Ʒ����', '�Ǻ���', 472, '2016-11-05', '��˵�Ķ�', '��������', '����'),
	(3, NULL, NULL, 'С��', 5454781, '�ð�', '����״�ѧ', 656244, NULL, '�кβ���', '���ո�ȥ', '���Ǻ���'),
	(20, NULL, NULL, 'С����֨֨֨֨', 5454781, '�ðɰͰͰְ�', '����״�ѧ������', 656244, NULL, '�кβ���', '���ո�ȥ', '���Ǻ���������'),
	(21, NULL, NULL, 'С����֨֨֨֨', 5454781, '�ðɰͰͰְ�', '����״�ѧ������', 656244, NULL, '�кβ���', '���ո�ȥ', '���Ǻ���������'),
	(22, NULL, NULL, 'С��', 5454781, '�ð�', '����״�ѧ', 656244, NULL, '�кβ���', '���ո�ȥ', '���Ǻ���'),
	(23, NULL, NULL, 'С��', 5454781, '�ð�', '����״�ѧ', 656244, NULL, '�кβ���', '���ո�ȥ', '���Ǻ���'),
	(24, NULL, NULL, 'С��', 5454781, '�ð�', '����״�ѧ', 656244, NULL, '�кβ���', '���ո�ȥ', '���Ǻ���'),
	(25, NULL, NULL, 'С��', 5454781, '�ð�', '����״�ѧ', 656244, NULL, '�кβ���', '���ո�ȥ', NULL),
	(26, NULL, NULL, 'С��', 5454781, '�ð�', '����״�ѧ', 656244, NULL, '�кβ���', '���ո�ȥ', '���Ǻ���'),
	(27, NULL, NULL, 'С��', 5454781, '�ð�', '����״�ѧ', 656244, NULL, '�кβ���', '���ո�ȥ', '���Ǻ���');