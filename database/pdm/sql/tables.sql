/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2018/4/1 15:22:49                            */
/*==============================================================*/


drop table if exists Base_User;

drop table if exists GBF_Item_Info;

/*==============================================================*/
/* Table: Base_User                                             */
/*==============================================================*/
create table Base_User 
(
   id                   int                            not null,
   userName             varchar(50)                    null,
   password             varchar(50)                    null,
   create_time          datetime                       null,
   last_modify_time     datetime                       null,
   cellphone            varchar(11)                    null,
   email                varchar(50)                    null,
   gbf_id               varchar(20)                    null,
   constraint PK_BASE_USER primary key clustered (id)
);

comment on table Base_User is 
'用户基本信息';

/*==============================================================*/
/* Table: GBF_Item_Info                                         */
/*==============================================================*/
create table GBF_Item_Info 
(
   id                   int                            not null,
   patch                int                            null,
   category_type        varchar(10)                    null,
   image                int                            null,
   is_display_item      bit                            null,
   item_id              int                            null,
   name                 varchar(50)                    null,
   number               int                            null,
   user_id              varchar(20)                    null,
   create_time          datetime                       null,
   constraint PK_GBF_ITEM_INFO primary key clustered (id)
);

comment on table GBF_Item_Info is 
'gbf中item信息';

