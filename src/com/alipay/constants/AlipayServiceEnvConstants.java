

/**

 * Alipay.com Inc.

 * Copyright (c) 2004-2014 All Rights Reserved.

 */

package com.alipay.constants;


/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 * 
 * @author taixu.zqq
 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49 taixu.zqq Exp $
 */
public class AlipayServiceEnvConstants {

    /**支付宝公钥-从支付宝生活号详情页面获取*/
	public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1GtK+8COV9VGgof1WtHItVRMiflrrK4owPFIbsxuEi+6X2HNmk0urZuTe+gagLMA9hXOmVnol2hrZ9wNS+22If5vs87wtncv0L97yqj8zqrMR/DsxtMKgd7a2bWs+W686espHVW1bxYwrcAB9bTvZfhpNOVbSc9nifOMTzoQYoa9i5ErWH2ObDSh3IrzypJuIAMwuOWzwEzZdBXu1tCgSZWQHbldXrT8dvNnnhEUuT/lMqV+uLTIPT/Cue/3x1hUb9BByG3oPTj/FazL2e19tfi89gyzMLXBdiMS+RiUVhafuxQk487FOxFBqwp5gFpNS7LGJ31khJlJKEWGsmCtSwIDAQAB";
    
    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      = "GBK";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           = "GBK";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA2";
    
    /**开发者账号PID*/
    public static final String PARTNER           = "2088621962764050";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的生活号id  
    public static final String APP_ID            = "2017111800027686";

    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCicpLsrV4OKwfPZfe7mkT1tWlWA82+41PqHqe802YFqVmzWZNJF0TtRd2FdL8TSagPOidQOOhmrSSTaT+fD5ywpjoKf4qhKKNt5vWHS1n6fU8/P3EcBzD1Eo4PTCMiRtULtkUaM7vPQF59O8TnFmslLRTr44eJbz7HH+amekZOTN6c7mdee+cjpbre/NNwAbldYsPmou2WMNCAD86om9PU69mX2NK9OVZbwLrXxbaozvXaSpXuiQN2CeIz1R6fb3KIYXg0kKmb2ZodPRrIQ7Dl9SD1jVNpIX48YvI/bDaDHdnm/ozmjsL3pEdYDdKITcYEY1MrEipC5qQBITvk9ZMjAgMBAAECggEAB+ULkOcICCY9Ne4dsQdZTJupZ929dQZ1QI6G1l1ruuC1FEtJJic0WVeo4WCAHL7apQrNeE+bs8m8WlGmHuPSWJ9reLEkGprv/lpYGmAmGk9Wt5sssxECZxakwsePeY35sp0EFLbo7LSTIwDxm81yHZdoSeJ/5sT6RxEc04BjxFBSNvd/niBiSb8y+CXZre1BnV7zlvWOkQ9elTpPIxtU/HmrON7AM1iIGIdDfNEC8rxAdiXD42C2mxZ/v49lIx17JO5Kc+7UL5vkE6SzoQD9f4mlCg21Pi9kS9/KqbMywp1XF0U4UWLKzjeANVFoqUqsf4Pnhs5XcM0JGQbHlrhquQKBgQDUOKBU27CXLeP279IHLMO9FTYVeI28KLLIdWezfoUZFaFY/aspdlUtfkJUF5bKUMLpztvbEWvFFJAAzJgB2ecc4Uhzk5bGxvAaTnff8qb4qG+kDsO6+sP2lZkmxaikwl1vP2WXi7slaDIfAf3vjTA/nV3CubEwKGUB5JDang3g1QKBgQDD9Wh4IyVNDlAiq6pKEfnxdgYvHtHLim7ecFeKDQj6QqeFyI7UwMOSUJB8H981WKyLKynDiG3c5lSZTPGptiGDCFGSjmLtzuCu3ZPbSkT9ABojd2fVXYP93UbRYk4aFkOyD3/p+RRiPdbBTsdO3uBLeJeGa0fhLN/XzFuadwzgFwKBgFol372MQNxHSyH3R5Fyq4cjfoDqX9LAuwk6Dh4KLYG1VX+W6eFH+fDERGqyRoSUf+ePzoalRNFH5c/hGOUYafszm3I1DIRNt2qFUJiZ2+GesyXOe8hug1W4wIDez7+FLOl31bDlU08VjszrLLJYmFk9gLmZ5bGeRyHhtMKZBy4tAoGAVWPFCETYZkGMbe88H1bCAZQakcHuTbGfKlLt8nxHozYUZdnFU7REBKgSreP9kfN4DJTceBYlOZMs3jiHPhrdc4nWcfSV62awxcJMQcyVT2ISAc5wcqtzbtZTm74opnl5OkhCxyQA2+ZyhH3dn+LC/mAoNyzcf6TcTd8BM8gY1jUCgYAQoUNFELLfM5w8J+OLmv0ZcRusmtflgb+W9QEqW+P+j++699fWPacCC1SDOe2+wulew/+xWYJn3j2Awhs3oUVpZmmbPwtNToNGac8z9cje/TaQ3WchNcMZPSfFQAQQB6rIQKcv24rilRUZCByU1DcX60q8xgzBzHgEfz8qCDoukA==";
    
    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAonKS7K1eDisHz2X3u5pE9bVpVgPNvuNT6h6nvNNmBalZs1mTSRdE7UXdhXS/E0moDzonUDjoZq0kk2k/nw+csKY6Cn+KoSijbeb1h0tZ+n1PPz9xHAcw9RKOD0wjIkbVC7ZFGjO7z0BefTvE5xZrJS0U6+OHiW8+xx/mpnpGTkzenO5nXnvnI6W63vzTcAG5XWLD5qLtljDQgA/OqJvT1OvZl9jSvTlWW8C618W2qM712kqV7okDdgniM9Uen29yiGF4NJCpm9maHT0ayEOw5fUg9Y1TaSF+PGLyP2w2gx3Z5v6M5o7C96RHWA3SiE3GBGNTKxIqQuakASE75PWTIwIDAQAB";
    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}