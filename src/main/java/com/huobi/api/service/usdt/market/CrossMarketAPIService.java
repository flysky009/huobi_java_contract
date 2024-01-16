package com.huobi.api.service.usdt.market;


import com.huobi.api.response.usdt.market.SwapCrossAdjustfactorResponse;
import com.huobi.api.response.usdt.market.SwapCrossTradeStateResponse;
import com.huobi.api.response.usdt.market.SwapCrossTransferStateResponse;
import com.huobi.api.response.usdt.market.SwapLadderMarginResponse;

public interface CrossMarketAPIService {
    SwapCrossAdjustfactorResponse getSwapCrossAdjustfactor(String contractCode, String contractType, String pair, String businessType, String tradePartition);//查询平台阶梯调整系数(全仓模式)

    SwapCrossTransferStateResponse getSwapCrossTransferState(String marginAccount);//查询系统划转权限（全仓模式）

    SwapCrossTradeStateResponse getSwapCrossTradeState(String contractCode, String contractType, String pair, String businessType, String tradePartition);//查询系统交易权限（全仓模式）

    SwapLadderMarginResponse getSwapCrossLadderMargin(String contractCode, String contractType, String pair, String businessType, String tradePartition);
}
