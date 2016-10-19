# Sistar

> SISTAR，韩文名称씨스타，意思是要做演艺圈的姐妹大明星，是韩国的四人女子组合

---

## 背景

举个栗子:
* 网上商城有两种水果苹果跟橘子  
* 每种100个,进价1元一个,按照2元一个的价格出售

按照REST的解决方案，如下  

* 网站提供API接口/存储数据/后台管理 
* 主要的交易交互在用户android手机客户端实现
* 网站的Authon 授权暂缓实现  
* 支付接口暂缓实现

## 更多说明

### GET ci310/index.php/api/widgets/apple
获取关于苹果的信息  售价 库存 果品等级等

### PUT ci310/index.php/api/widgets/apple
更新苹果信息  用户购买产品

### GET ci310/index.php/api/widgets/orange
获取关于橘子的信息  售价 库存 果品等级等

### PUT ci310/index.php/api/widgets/orange
更新苹果信息  用户购买产品
