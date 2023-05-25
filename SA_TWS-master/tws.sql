create table bot
(
    BotID        char(30) not null
        primary key,
    Location     char(30) not null,
    BotStatus    int      not null,
    DepositoryID char(30) not null
);

create table depository
(
    DepositoryID   char(30) not null
        primary key,
    DepositoryName char(30) not null
);

create table request
(
    RequestID        char(30) not null
        primary key,
    UserID           char(30) not null,
    RequestType      char(30) not null,
    ToolID           char(30) not null,
    RequestTargetNum int      not null,
    RequestResult    int      not null
);

create table shelf
(
    ShelfID      char(30) not null
        primary key,
    DepositoryID char(30) not null,
    Location     char(30) not null
);

create table tool
(
    ToolID       char(30) not null
        primary key,
    ToolName     char(30) not null,
    ToolType     char(30) not null,
    DepositoryID char(30) not null,
    ShelfID      char(30) not null,
    ToolNum      int      not null
);

create table user
(
    UserID         char(30) not null
        primary key,
    UserName       char(30) not null,
    UserPassword   char(30) not null,
    UserType       char(30) not null,
    UserDepartment char(30) null
);


