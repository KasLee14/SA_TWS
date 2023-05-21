# TWS项目设计

## 一、项目整体设计

​    	TWS系统项目整体基于JavaEE的MyBatis框架，后端部分通过设计接口连接MySQL数据库进行操作，前端部分基于Vue进行编写。

​    	TWS系统的用户分为管理员、一般员工与专家三类。一般员工与专家在注册后即可登录借用工具，管理员则负责处理一般员工与专家的工具借用请求。需要注意的是，一般员工只可借用隶属自己部门的工具，而专家可以借用所有类别的工具。

​    	TWS系统项目分为ETMS和WMS两块。ETMS系统负责记录工具的借还状态，WMS系统负责进行工具的具体提取管理。

 

## 二、TWS系统设计

### 1）类设计

​    	TWS系统中包括一个User类（用户类），User类存储着系统登陆人员的基本信息。基本信息包括UserID（用户ID，字符串）、UserName（用户姓名，字符串）、UserPassword（密码，字符串）、UserType（用户类别，字符串）等。Admin类（管理员类）、Employee类（一般员工类）、Specialist类（专家类）均继承自User类。Employee类中包含UserDepartment（所属部门，字符串）信息。Department信息包括ConstructionDeviceRepair、AutomobileRepair、ApplianceRepair和ComputerRepair。

​    	TWS系统中包括一个Log类（日记类），用于记录用户的每一次成功操作。基本信息包括LogID（日记ID，字符串）、LogType（日记类型，字符串）、LogInfo（具体操作信息，字符串）。

 

### 2）方法设计

#### 	User类： 

​    		ChangePassword：public方法，更改用户密码

​    		ShowInfo：public方法，返回用户基本信息

​    		增删改查略

#### 	Admin类：

​    		ShowUserInfo：public方法，通过检索UserID展示目标用户基本信息

​    		ChangeUserPassword：public方法，通过检索UserID更改目标用户密码

​    		ChangeUserType：public方法，更改目标用户权限

   	 	RegisterUser：public方法，可注册新用户

​    		ChangeUserName：public方法，通过检索UserID更改目标用户姓名

​    		增删改查略

#### 	Log类：

​    		ShowLogInfo：public方法，通过检索LogID展示对应Log信息

   	 	ShowInfoList：public方法，返回所有Log信息

​    		增删改查略

 

### 3）界面设计

​		TWS系统主界面包括一个登陆界面，通过登录验证用户名密码后才可进入主界面。主界面包括三个功能：管理当前用户信息、进入ETMS系统以及进入WMS系统。

​		用户信息管理界面展示当前用户的UserID、UserName、Type信息，并可对相应信息进行修改。当登录用户为Employee和Specialist时，可以更改用户密码；当登录用户为Admin时，可更改目标用户的密码、类型、姓名，并查看Log。

 

## 二、ETMS系统设计

### 1）类设计

​    	ETMS系统中包括一个Tool类，记录工具的基本信息。Tool类信息包括ToolID(工具的唯一标识ID，字符串)ToolName（工具名称，字符串）、ToolType（工具类型，字符串）、DepositoryID（工具所在仓库位置，字符串）、ShelfID（每个工具所属的Shelf的ID，字符串）、ToolNum（工具数量，整型）。ToolType分为InexpensiceTool和ExpensiveTool两种。

​    	ETMS系统中包括一个ResponseRequest类，负责处理用户的工具借用请求。ResponseRequest类中应包括RequestUserID（发起请求的用户的ID，字符串）、RequestType（请求类型，包括借与还两种，字符串）、RequestTargetToolID（请求目标工具的ID，字符串）、RequestTargetNum（请求目标工具的数目，整数）、RequestResult（请求是否通过，用1、0、-1表示通过、不通过、未读，整型）。所有来自用户的请求应存储到数据库中由管理员进行统一处理。

 

### 2）方法设计

####     Tool类：

​       	ShowToolList：public方法，返回所有工具基本信息

​       	ShowInfoByID：public方法，通过检索ToolID展现对应工具信息

​       	增删改查略

####     Request类：

​       	ShowReqList：public方法，返回当前所有请求信息

​       	ShowTargetInfo：public方法，通过检索RequestID展示对应请求信息

​       	SearchInfo：public方法，筛选请求信息，筛选条件包括请求是否通过、请求是否处理

​       	ManageTargetRequest：public方法，通过检索RequestID处理对应请求信息

​       	增删改查略

 

### 3）界面设计

​    	ETMS系统界面根据用户类别展现功能不同。

​    	对于Employee和Specialist用户，ETMS系统界面中包括了查看当前所有工具存储信息、检索对应ToolI工具信息、发出借还请求等功能。

​    	对于Admin用户，ETMS系统界面中包括了查看当前所有工具存储信息、检索对应ToolI工具信息、处理借还请求等功能。

 

## 三、WMS系统设计

### 1）类设计

​    	WMS系统中包括一个Bot类。Bot类中基本信息包括BotID（每个机器人的唯一标识，字符串）、DepositoryID（Bot所属的仓库的ID，字符串）、Location（Bot在仓库中具体位置，字符串）、BotStatus（Bot当前状态，有1、0、-1两种，分别对应工作中、休息中、故障中，整型）。

​    	WMS系统中包括一个Manage类。Manage类负责管理仓库中工具信息。

​    	WMS系统中包括一个Shelf类。Shelf类中基本信息包括ShelfID（每个货架的唯一标识，字符串）、ShelfDepository（每个货架所属的仓库的ID，字符串）、Location（货架位置，字符串）。

​    	WMS系统中包括一个Depository类。Depository类中基本信息包括DepositoryID（仓库名称，字符串）。

 

### 2）方法设计

####     Bot类：

​       	ShowBotID：public方法，通过检索BotID返回特定Bot信息

​       	增删改查略

####     Manage类：

​       	RentTool：public方法，通过检索RequestID完成对工具的租借

​       	BotRepair：public方法，检索处于故障中的机器人并对故障机器人进行维修

​       	ShowReq：public方法，返回当前用户所发出的请求

​       	ShowReqList：public方法，返回所有请求

####     Shelf类：

​       	ShowToolList：public方法，返回当前货架中所有工具的信息

​       	ShowInfo：public方法，返回当前货架信息

​       	增删改查略

####     Depository类：

​       	ShowShelfList：public方法，返回当前货架中所有工具的信息

​       	ShowInfo：public方法，返回当前仓库信息

​       	增删改查略

​    

###     3）界面设计

​    		WMS系统界面根据用户类别展现功能不同。

​    		对于Employee和Specialist用户，WMS界面中可查看自己所发出的请求并进行工具的租借。

​    		对于Admin用户，WMS界面中可管理当前所有请求并管理所有仓库、货架、工具的信息。

 

## 四、数据库设计

​		TWS系统项目中包括User、Tool、Bot、Shelf、Depository四张表。

​    	表User中包括UserID（字符串）、UserName（字符串）、UserPassword（字符串）、UserType（字符串）、UserDepartment（字符串），其中UserID为主码。

​    	表Tool中包括ToolID(字符串)、ToolName（字符串）、ToolType（字符串）、DepositoryID（字符串）、ShelfID（字符串）、ToolNum（整型），其中ToolID为主码。需注意的是每个仓库中相同工具的ToolID应为不同。

​    	表Bot中包括BotID（字符串）、Location（字符串）、BotStatus（整型）、DepositoryID（字符串）。其中BotID为主码。

​    	表Shelf中包括ShelfID（字符串）、DepositoryID（字符串）、Location（字符串）。其中ShelfID为主码。

​    	表Depository中包括DepositoryID（字符串）。其中DepositoryID为主码。
