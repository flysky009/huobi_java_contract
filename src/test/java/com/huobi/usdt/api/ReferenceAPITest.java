package com.huobi.usdt.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.request.usdt.account.SwapLiquidationOrdersV3Request;
import com.huobi.api.response.usdt.account.SwapLiquidationOrdersV3Response;
import com.huobi.api.response.usdt.account.SwapSwitchAccountTypeResponse;
import com.huobi.api.response.usdt.account.SwapUnifiedAccountTypeResponse;
import com.huobi.api.response.usdt.market.*;
import com.huobi.api.service.usdt.reference.ReferenceAPIServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class ReferenceAPITest implements BaseTest {
    ReferenceAPIServiceImpl huobiAPIService  = new ReferenceAPIServiceImpl("dbfd1732-fcd5eec8-13a02ff6-bgrdawsdsd", "d05ed75e-e4de67d0-958e1b82-94062");

    @Test
    public void getSwapFundingRateResponse() {
        SwapFundingRateResponse response = huobiAPIService.getSwapFundingRate("BTC-USDT");
        logger.debug("1.获取合约的资金费率:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapBatchFundingRate(){
        SwapBatchFundingRateResponse response=huobiAPIService.getSwapBatchFundingRate("","");
        logger.debug("2.批量获取合约资金费率:{}",JSON.toJSONString(response));
    }

    @Test
    public void getSwapHistoricalFundingRateResponse() {
        SwapHistoricalFundingRateResponse response = huobiAPIService.getSwapHistoricalFundingRate("BTC-USDT", 1, 10);
        logger.debug("3.获取合约的历史资金费率:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapLiquidationOrdersV3(){
        SwapLiquidationOrdersV3Request request = SwapLiquidationOrdersV3Request.builder().tradeType(5).contract("BTC-USDT").build();
        SwapLiquidationOrdersV3Response response = huobiAPIService.getSwapLiquidationOrdersV3(request);
        logger.debug("4.获取强平订单(新):{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapSettlementRecords(){
        SwapSettlementRecordsResponse response=huobiAPIService.getSwapSettlementRecords("btc-usdt",0l,0l,1,20);
        logger.debug("5.查询平台历史结算记录:{}",JSON.toJSONString(response));
    }

    @Test
    public void getSwapEliteAccountRatioResponse() {
        SwapEliteAccountRatioResponse response = huobiAPIService.getSwapEliteAccountRatio("BTC-USDT", "60min");
        logger.debug("6.精英账户多空持仓对比-账户数:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapElitePositionRatioResponse() {
        SwapElitePositionRatioResponse response = huobiAPIService.getSwapElitePositionRatio("BTC-USDT", "60min");
        logger.debug("7.精英账户多空持仓对比-持仓量:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapApiStateResponse() {
        SwapApiStateResponse response = huobiAPIService.getSwapApiState("","");
        logger.debug("8.查询系统状态:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapLadderMargin(){
        SwapLadderMarginResponse response = huobiAPIService.getSwapLadderMargin("", "");
        logger.debug("9.获取平台阶梯保证金:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapEstimatedSettlementPriceResponse() {
        SwapEstimatedSettlementPriceResponse response = huobiAPIService.getSwapEstimatedSettlementPrice("btc-usdt","","","","");
        logger.debug("10.获取预估结算价:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapAdjustfactorResponse() {
        SwapAdjustfactorResponse response = huobiAPIService.getSwapAdjustfactor("BTC-USDT","");
        logger.debug("11.查询平台阶梯调整系数:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapInsuranceFundResponse() {
        SwapInsuranceFundResponse response = huobiAPIService.getSwapInsuranceFund("BTC-USDT", null, null);
        logger.debug("12.查询合约风险准备金余额历史数据:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapRiskInfoResponse() {
        SwapRiskInfoResponse response = huobiAPIService.getSwapRiskInfo("","","");
        logger.debug("13.查询合约风险准备金余额和预估分摊比例:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapPriceLimit() {
        SwapPriceLimitResponse result =
                huobiAPIService.getSwapPriceLimit("","","","all","all");
        logger.debug("14.获取合约最高限价和最低限价：{}", JSON.toJSONString(result));
    }

    @Test
    public void getSwapOpenInterest() {
        SwapOpenInterestResponse result =
                huobiAPIService.getSwapOpenInterest("btc-usdt","","","","");
        logger.debug("15.获取当前可用合约总持仓量:{}", JSON.toJSONString(result));
        result = huobiAPIService.getSwapOpenInterest("","","","","");
        logger.debug("15.获取当前可用合约总持仓量:{}", JSON.toJSONString(result));
    }

    @Test
    public void getSwapContractInfo() {
        SwapContractInfoResponse result =
                huobiAPIService.getSwapContractInfo("", "","","","","");
        logger.debug("16.获取合约信息：{}", JSON.toJSONString(result));
    }

    @Test
    public void getSwapIndex() {
        SwapIndexResponse result =
                huobiAPIService.getSwapIndex("btc-usdt","");
        logger.debug("17.获取合约指数信息：{}", JSON.toJSONString(result));
        result =
                huobiAPIService.getSwapIndex("","");
        logger.debug("17.获取合约指数信息：{}", JSON.toJSONString(result));
    }

    @Test
    public void getSwapQueryElements(){
        SwapQueryElementsResponse response = huobiAPIService.getSwapQueryElements(null);
        logger.debug("18、合约要素:{}",JSON.toJSONString(response));
    }
}
