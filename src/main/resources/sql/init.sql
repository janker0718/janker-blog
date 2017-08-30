CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '名称',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;