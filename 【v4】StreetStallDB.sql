CREATE DATABASE IF NOT EXISTS StreetStallDB  DEFAULT CHARACTER SET utf8;

USE StreetStallDB;




DROP TABLE IF EXISTS t_store;
CREATE TABLE t_store (
  store_id char(36) NOT NULL COMMENT  '店铺id',
  business_license_number char(36) NOT NULL COMMENT  '营业执照号码',
  hygienic_license_number  char(36) NOT NULL COMMENT  '卫生许可证号码',
  health_certificate_number char(36) NOT NULL COMMENT  '健康证号码',
  ID_number char(36) NOT NULL COMMENT  '店主身份证号',
  user_name varchar(100) NOT NULL COMMENT '店主姓名',
  store_name varchar(100) NOT NULL COMMENT '店铺名称',
  store_type varchar(100) NOT NULL COMMENT '店铺类型（餐饮、日用品、农副、技能展示等）',
  province VARCHAR(50) NOT NULL,
  city VARCHAR(50) NOT NULL,
  district VARCHAR(50) NOT NULL,
  street VARCHAR(100) NOT NULL,
  start_date date DEFAULT NULL COMMENT '店铺申请起始日期',
  end_date date DEFAULT NULL COMMENT '店铺申请结束日期',
  business_content varchar(1000) NOT NULL COMMENT '店铺经营具体信息',
  PRIMARY KEY (store_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into t_store(store_id,store_name,business_license_number,hygienic_license_number,health_certificate_number,ID_number,user_name,store_type,province,city,district,street,start_date,end_date,business_content) 
values('f577f9f9','1231321','5435543543','5643653456','2313123132131','张三','食尚左岸','餐饮','广东','佛山','南海','大学城','2023-05-20','2023-06-20','店铺主要在佛山市南海区狮山镇狮山大学城阳光广场路道上进行小炒售卖');

DROP TABLE IF EXISTS t_comment;

CREATE TABLE t_comment (
  store_id char(36) NOT NULL COMMENT  '评论的店铺id',
  comment_id char(36) NOT NULL COMMENT '评论id主键',
  user_name varchar(100) NOT NULL COMMENT '用户昵称',
  comment_score int(11) DEFAULT '1' COMMENT '评论的打分（最高5，最小1）',
  comment_content varchar(1000) DEFAULT '',
  foreign key(store_id) references t_store(store_id),
  PRIMARY KEY (comment_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*Data for the table t_user */
insert  into t_comment(store_id,comment_id,user_name,comment_score,comment_content) 
values ('f577f9f9','fd7b294bc208','小甜狗',5,'好吃! !一定要错峰来不用排队，点的都不踩雷，有不吃辣的朋友在，所以点了微辣的，不辣很香。爱吃辣的可以试试中辣。');

select * from t_comment;


DROP TABLE IF EXISTS t_report;
CREATE TABLE t_report (
  store_id char(36) NOT NULL COMMENT  '举报的店铺id',
  report_id char(36) NOT NULL COMMENT  '举报信息的id',
  user_name varchar(100) NOT NULL COMMENT '发起举报用户昵称',
  report_content varchar(1000) NOT NULL COMMENT '举报的具体信息',
  report_status int(1) DEFAULT '0' COMMENT '举报是否被处理（0表示未处理）',
--   report_imgurl varchar(500) DEFAULT '',
  foreign key(store_id) references t_store(store_id),
  PRIMARY KEY (report_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into t_report(store_id,report_id,user_name,report_content,report_status) 
values('f577f9f9','fd7b294bc209','小甜狗','该店铺违法摆放垃圾，且占用正常通行的道路，并且使用违规调味剂',0);


DROP TABLE IF EXISTS t_apply;
CREATE TABLE t_apply(
  
  business_license_number char(36) NOT NULL COMMENT  '营业执照号码',
  hygienic_license_number  char(36) NOT NULL COMMENT  '卫生许可证号码',
  health_certificate_number char(36) NOT NULL COMMENT  '健康证号码',
  ID_number char(36) NOT NULL COMMENT  '申请人身份证号',
  user_name varchar(100) NOT NULL COMMENT '申请人姓名',
  store_name varchar(100) NOT NULL COMMENT '店铺名称',
  store_type varchar(100) NOT NULL COMMENT '店铺类型（餐饮、日用品、农副、技能展示等）',
  
  province VARCHAR(50) NOT NULL,
  city VARCHAR(50) NOT NULL,
  district VARCHAR(50) NOT NULL,
  street VARCHAR(100) NOT NULL,
  
  start_date date DEFAULT NULL COMMENT '店铺申请起始日期',
  end_date date DEFAULT NULL COMMENT '店铺申请结束日期',
  business_content varchar(1000) NOT NULL COMMENT '店铺经营具体信息',
  deal_status int(1) DEFAULT '0' COMMENT '申请是否处理（0表示未处理）',
  apply_status int(1) DEFAULT '0' COMMENT '申请是否通过（0表示未通过）',
  store_id char(36) DEFAULT NULL COMMENT  '店铺id',
  PRIMARY KEY (business_license_number)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert  into t_apply(business_license_number,hygienic_license_number,health_certificate_number,
ID_number,user_name,store_name,store_type,province,city,district,street,start_date,end_date,business_content) values
 ('1231321','5435543543','5643653456','2313123132131','张三','食尚左岸','餐饮','广东','佛山','南海','大学城','2023-05-20','2023-06-20','店铺主要在佛山市南海区狮山镇狮山大学城阳光广场路道上进行小炒售卖');
 
select * from t_apply;
select * from t_report;
select * from t_comment;
select * from t_store;
