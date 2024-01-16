package com.huobi.wss.constants;

public class HuobiFutureWSSConstants {

    //市场行情接口 订阅
    public static final String MARKET_KLINE_PERIOD_SUB = "market.$symbol.kline.$period"; // 1.订阅 KLine 数据
    public static final String MARKET_DEPTH_SUB = "market.$symbol.depth.$type"; // 2.订阅 Market Depth 数据
    public static final String MARKET_DETAIL_SUB = "market.$symbol.detail";// 3.订阅 Market detail 数据
    public static final String MARKET_DEPTH_DIFF_SUB = "market.$symbol.depth.size_${size}.high_freq"; // 订阅MarketDepth增量数据
    public static final String MARKET_BBO_SUB = "market.$symbol.bbo";
    public static final String MARKET_TRADE_DETAIL_SUB = "market.$symbol.trade.detail";
    public static final String MARKET_INDEX_SUB = "market.$symbol.index.$period";
    public static final String MARKET_BASIS_PRICE_TYPE_SUB = "market.$symbol.basis.$period.$basis_price_type";
    public static final String MARKET_MARK_PRICE_SUB = "market.$symbol.mark_price.$period";


    //市场行情接口 请求
    public static final String MARKET_KLINE_PERIOD_REQ = "market.$symbol.kline.$period"; // 1.请求 KLine 数据
    public static final String MARKET_DEPTH_REQ = "market.$symbol.depth.$type"; // 2.请求 Market Depth 数据
    public static final String MARKET_DETAIL_REQ = "market.$symbol.detail";// 3.请求 Market detail 数据
    public static final String MARKET_TRADE_DETAIL_REQ = "market_trade_detail_sub";
    public static final String MARKET_INDEX_REQ = "market_index_sub";
    public static final String MARKET_BASIS_PRICE_TYPE_REQ = "market_basis_price_type_sub";
    public static final String MARKET_MARK_PRICE_REQ = "market.$symbol.mark_price.$period";


    //交易接口
    public static final String ORDERS_SYMBOL = "orders.$symbol"; // 1.订阅订单成交数据
    public static final String LIQUIDATION_ORDERS_SYMBOL = "liquidationOrders.$symbol"; // 2.订阅某个品种下的强平订单信息


    //资产接口
    public static final String ACCOUNTS_SYMBOL = "accounts.$symbol"; // 1.订阅某个品种下的资产变动信息
    public static final String POSITIONS_SYMBOL = "positions.$symbol"; // 2.订阅某个品种下的持仓变动信息

    //订单和用户数据接口
    public static final String PUBLIC_LIQUIDATION_ORDERS = "public.$symbol.liquidation_orders";
    public static final String PUBLIC_CONTRACT_INFO = "public.$symbol.contract_info";
    public static final String TRIGGER_ORDER_SYMBOL = "trigger_order.$symbol";
    public static final String matchOrders_symbol = "matchOrders.$symbol";

    //系统状态更新接口
    public static final String PUBLIC_HEARTBEAT = "public.$service.heartbeat";


}
