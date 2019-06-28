/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/12/12 ÐÇÆÚÈý ÉÏÎç 10:07:10                   */
/*==============================================================*/


drop table if exists t_basicData;

drop table if exists t_customer;

drop table if exists t_menu;

drop table if exists t_order;

drop table if exists t_order_detail;

drop table if exists t_role;

drop table if exists t_role_menu;

drop table if exists t_user;

drop table if exists t_user_role;

/*==============================================================*/
/* Table: t_basicData                                           */
/*==============================================================*/
create table t_basicData
(
   base_id              int not null auto_increment,
   parent_id            int,
   base_name            varchar(20) not null,
   base_desc            varchar(30),
   primary key (base_id)
);

/*==============================================================*/
/* Table: t_customer                                            */
/*==============================================================*/
create table t_customer
(
   customer_id          int not null auto_increment,
   order_id             int,
   base_id              int,
   user_id              int,
   customer_name        varchar(20) not null,
   mobile_phone         bigint,
   email                varchar(30),
   address              varchar(50),
   id_card              varchar(18),
   c_sex                bool,
   remark               varchar(200),
   primary key (customer_id)
);

/*==============================================================*/
/* Table: t_menu                                                */
/*==============================================================*/
create table t_menu
(
   menu_id              int not null auto_increment,
   parent_menu_id       int,
   menu_name            varchar(20) not null,
   menu_desc            varchar(30),
   menu_link            varchar(50),
   security_name        varchar(50),
   m1                   varchar(20),
   m2                   varchar(20),
   primary key (menu_id)
);

/*==============================================================*/
/* Table: t_order                                               */
/*==============================================================*/
create table t_order
(
   order_id             int not null auto_increment,
   customer_id          int,
   user_id              int,
   shipping_address     varchar(50),
   shipping_name        varchar(20),
   shipping_phone       varchar(13),
   take_name            varchar(20),
   take_address         varchar(50),
   take_phone           varchar(13),
   order_desc           varchar(100),
   order_status         tinyint,
   payment_method_id    int,
   dest_area_id         int,
   trans_method_id      int,
   take_method_id       int,
   primary key (order_id)
);

/*==============================================================*/
/* Table: t_order_detail                                        */
/*==============================================================*/
create table t_order_detail
(
   order_detail_id      int not null auto_increment,
   order_id             int,
   goods_name           varchar(30),
   goods_number         int,
   goods_unit           int,
   goods_unit_price     numeric(10,2),
   goods_total          numeric(10,2),
   goods_remark         varchar(100),
   primary key (order_detail_id)
);

/*==============================================================*/
/* Table: t_role                                                */
/*==============================================================*/
create table t_role
(
   role_id              int not null auto_increment,
   role_name            varchar(20) not null,
   role_desc            varchar(30),
   primary key (role_id)
);

/*==============================================================*/
/* Table: t_role_menu                                           */
/*==============================================================*/
create table t_role_menu
(
   role_id              int not null,
   menu_id              int not null,
   primary key (role_id, menu_id)
);

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   user_id              int not null auto_increment,
   user_name            varchar(20) not null,
   real_name            varchar(20),
   password             varchar(16) not null,
   email                varchar(30),
   phone                bigint,
   u1                   varchar(20),
   u2                   varchar(20),
   primary key (user_id)
);

/*==============================================================*/
/* Table: t_user_role                                           */
/*==============================================================*/
create table t_user_role
(
   user_id              int not null,
   role_id              int not null,
   primary key (user_id, role_id)
);

alter table t_basicData add constraint FK_sub_basic foreign key (parent_id)
      references t_basicData (base_id) on delete restrict on update restrict;

alter table t_customer add constraint FK_Relationship_6 foreign key (base_id)
      references t_basicData (base_id) on delete restrict on update restrict;

alter table t_customer add constraint FK_customer_order foreign key (order_id)
      references t_order (order_id) on delete restrict on update restrict;

alter table t_customer add constraint FK_user_customer foreign key (user_id)
      references t_user (user_id) on delete restrict on update restrict;

alter table t_menu add constraint FK_sub_menu foreign key (parent_menu_id)
      references t_menu (menu_id) on delete restrict on update restrict;

alter table t_order add constraint FK_customer_order2 foreign key (customer_id)
      references t_customer (customer_id) on delete restrict on update restrict;

alter table t_order add constraint FK_user_order foreign key (user_id)
      references t_user (user_id) on delete restrict on update restrict;

alter table t_order_detail add constraint FK_order_orderdetail foreign key (order_id)
      references t_order (order_id) on delete restrict on update restrict;

alter table t_role_menu add constraint FK_t_role_menu foreign key (role_id)
      references t_role (role_id) on delete restrict on update restrict;

alter table t_role_menu add constraint FK_t_role_menu2 foreign key (menu_id)
      references t_menu (menu_id) on delete restrict on update restrict;

alter table t_user_role add constraint FK_t_user_role foreign key (user_id)
      references t_user (user_id) on delete restrict on update restrict;

alter table t_user_role add constraint FK_t_user_role2 foreign key (role_id)
      references t_role (role_id) on delete restrict on update restrict;

