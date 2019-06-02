drop table if exists pts_user;
create table pts_user(
  id int auto_increment primary key ,
  phone varchar(20) comment '手机号',
  wx_openid varchar(64) comment '微信公众号openid',
  mini_openid varchar(64) comment '小程序openid',
  enable_status tinyint(2) default 0 comment '启用状态：0启用，1停用',
  delete_status tinyint(2) default 0 comment '删除状态：0未删除，1删除',
  create_time datetime comment '创建时间',
  update_time datetime on update current_timestamp comment '更新时间'
) comment '用户表';

drop table if exists pts_question;
create table pts_question(
  id int auto_increment primary key ,
  question varchar(100) comment '问题',
  remark varchar(300) comment '备注',
  sort int(3) comment '排序',
  enable_status tinyint(2) default 0 comment '启用状态：0启用，1停用',
  delete_status tinyint(2) default 0 comment '删除状态：0未删除，1删除',
  create_time datetime comment '创建时间',
  update_time datetime on update current_timestamp comment '更新时间'
) comment '问题表';


drop table if exists pts_question_option;
create table pts_question_option(
  id int auto_increment primary key ,
  question_id int comment '问题id',
  `option` varchar(100) comment '回答项',
  score int(3) comment '分值',
  remark varchar(300) comment '备注',
  sort int(3) comment '排序',
  enable_status tinyint(2) default 0 comment '启用状态：0启用，1停用',
  delete_status tinyint(2) default 0 comment '删除状态：0未删除，1删除',
  create_time datetime comment '创建时间',
  update_time datetime on update current_timestamp comment '更新时间'
) comment '回答表';

drop table if exists pts_user_test;
create table pts_user_test(
    id int auto_increment primary key ,
    user_id int comment '用户id',
    score int(3) comment '总分值',
    status tinyint(2) default 0 comment '测试完成状态:0未完成，1完成',
    enable_status tinyint(2) default 0 comment '启用状态：0启用，1停用',
    delete_status tinyint(2) default 0 comment '删除状态：0未删除，1删除',
    create_time datetime comment '创建时间',
    update_time datetime on update current_timestamp comment '更新时间'
) comment '用户测试表';

drop table if exists pts_user_test_option;
create table pts_user_test_option(
  id int auto_increment primary key ,
  test_id int comment '测试id',
  question_id int comment '问题id',
  option_ids varchar(100) comment '回答项,可能多选,多个id逗号分隔',
  score int(3) comment '分值',
  remark varchar(300) comment '备注',
  enable_status tinyint(2) default 0 comment '启用状态：0启用，1停用',
  delete_status tinyint(2) default 0 comment '删除状态：0未删除，1删除',
  create_time datetime comment '创建时间',
  update_time datetime on update current_timestamp comment '更新时间'
) comment '回答表';

insert into pts_question(question, remark, sort, create_time, update_time) values ('您精力充沛吗？','指精神头足，乐于做事',1,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您容易疲乏吗？','指体力如何，是否稍微活动一下或做一点家务劳动就感到累',2,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您容易气短，呼吸短促，接不上气吗？',null,3,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您说好声音低弱无力吗？','指说话没有力气',4,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您感到闷闷不乐、情绪低沉吗？','指心情不愉快，情绪低落',5,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您容易精神紧张、焦虑不安吗？','指遇事是否心情紧张',6,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您因为生活状态改变而感到孤独、失落吗？',null,7,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您容易感到害怕或受到惊吓吗？',null,8,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您感到身体超重不轻松吗？','感到身体沉重',8,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您眼睛干涩吗？',null,10,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您手脚发凉吗？','不包含因周围温度低或穿的少导致的手脚发冷',11,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您胃脘部、背部或腰膝部怕冷吗？','指上腹部、背部、腰部或膝关节等，有一处或多处怕冷',12,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您比一般人耐受不了寒冷吗？','指比别人容易害怕冬天或夏天的冷空调、电扇等',13,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您容易患感冒吗？','指每年感冒的次数',14,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您没有感冒时也会鼻塞、流鼻涕吗？',null,15,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您有口粘口腻，或睡眠打鼾吗？',null,16,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您容易过敏吗？','对药物、食物、气味、花粉或在季节交替、气候变化时',17,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您的皮肤容易起荨麻疹吗？','包括风团、风疹块、风疙瘩',18,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您的皮肤在不知不觉中会出现青紫瘀斑、皮下出血吗？','指皮肤在没有外伤的情况下出现青一块紫一块的情况',19,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您的皮肤一抓就红，并出现抓痕吗？','指被指甲或钝物过后皮肤的反应',20,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您皮肤或口唇干吗？',null,21,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您有肢体麻木或固定部位疼痛的感觉吗？',null,22,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您面部或鼻部有油腻感或者油光发亮吗？','指脸上或鼻子',23,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您面色或目眶晦黯，或出现褐色斑块/斑点吗？',null,24,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您有皮肤湿疹、疮疖吗？',null,25,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您感到口干咽燥、总想喝水吗？',null,26,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您感到口苦或嘴里有异味吗？','指口苦或口臭',27,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您腹部肥大吗？','指腹部脂肪肥厚',28,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您吃（喝）凉的东西或感到不舒服或者怕吃（喝）凉的东西吗？','指不喜欢吃凉的食物，或吃了凉的食物后会不舒服',29,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您有大便黏滞不爽、解不尽的感觉吗？','指大便容易粘在马桶或便坑壁上',30,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您容易大便干燥吗？','指大便容易粘在马桶或便坑壁上',31,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您舌苔厚腻或有舌苔厚厚的感觉吗？',null,32,sysdate(),sysdate());
insert into pts_question(question, remark, sort, create_time, update_time) values ('您舌下静脉瘀紫或增粗吗？',null,33,sysdate(),sysdate());

insert into pts_question_option(question_id, `option`, score, remark, sort, create_time, update_time)
select id,'没有（根本不/从来没有）',1,null,1,sysdate(),sysdate() from pts_question;
insert into pts_question_option(question_id, `option`, score, remark, sort, create_time, update_time)
select id,'很少（有一点）偶尔',2,null,2,sysdate(),sysdate() from pts_question;
insert into pts_question_option(question_id, `option`, score, remark, sort, create_time, update_time)
select id,'有时（有些/少数时间）',3,null,3,sysdate(),sysdate() from pts_question;
insert into pts_question_option(question_id, `option`, score, remark, sort, create_time, update_time)
select id,'经常（相当/多数时间）',4,null,4,sysdate(),sysdate() from pts_question;
insert into pts_question_option(question_id, `option`, score, remark, sort, create_time, update_time)
select id,'总是（非常/每天）',5,null,5,sysdate(),sysdate() from pts_question;