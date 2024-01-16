package com.huobi.api.service.coin_swap.market;


import com.huobi.api.request.coin_swap.account.LinearSwapBasisRequest;
import com.huobi.api.request.coin_swap.account.SwapLiquidationOrdersRequest;
import com.huobi.api.request.coin_swap.account.SwapMarketHistoryKlineRequest;
import com.huobi.api.request.coin_swap.market.SwapSettlementRecordsRequest;
import com.huobi.api.request.usdt.account.SwapLiquidationOrdersV3Request;
import com.huobi.api.response.coin_swap.market.*;
import com.huobi.api.response.usdt.account.SwapLiquidationOrdersV3Response;
import com.huobi.api.response.usdt.market.BatchMergedV2Response;
import com.huobi.api.response.usdt.market.SwapQueryElementsResponse;
import com.huobi.api.response.usdt.market.SwapSettlementRecordsResponse;

public interface MarketAPIService {
    SwapContractInfoResponse getSwapContractInfo(String contractCode);

    SwapIndexResponse getSwapIndex(String contractCode);

    SwapPriceLimitResponse getSwapPriceLimit(String contractCode);

    SwapOpenInterestResponse getSwapOpenInterest(String contractCode);

    SwapMarketDepthResponse getSwapMarketDepth(String contractCode, String type);

    SwapMarketHistoryKlineResponse getSwapMarketHistoryKline(SwapMarketHistoryKlineRequest request);

    SwapMarketDetailMergedResponse getSwapMarketDetailMerged(String contractCode);

    SwapMarketTradeResponse getSwapMarketTrade(String contractCode);

    SwapMarketHistoryTradeResponse getSwapMarketHistoryTrade(String contractCode,Integer size);

    SwapRiskInfoResponse getSwapRiskInfo(String contractCode);

    SwapInsuranceFundResponse getSwapInsuranceFund(String contractCode,Integer pageIndex,Integer pageSize);

    SwapAdjustfactorResponse getSwapAdjustfactor(String contractCode);

    SwapHisOpenInterestResponse getSwapHisOpenInterest(String contractCode,String period,Integer size,Integer amountType);

    SwapEliteAccountRatioResponse getSwapEliteAccountRatio(String contractCode,String period);

    SwapElitePositionRatioResponse getSwapElitePositionRatio(String contractCode, String period);

    SwapApiStateResponse getSwapApiState(String contractCode);

    SwapFundingRateResponse getSwapFundingRate(String contractCode);

    SwapHistoricalFundingRateResponse getSwapHistoricalFundingRate(String contractCode,Integer pageIndex,Integer pageSize);

    SwapLiquidationOrdersResponse getSwapLiquidationOrders(SwapLiquidationOrdersRequest request);

    LinearSwapPremiumIndexKlineResponse getLinearSwapPremiumIndexKline(String contractCode,String period,Integer size);

    LinearSwapEstimatedRateKlineResponse getLinearSwapEstimatedRateKline(String contractCode,String period,Integer size);

    LinearSwapBasisResponse getLinearSwapBasis(LinearSwapBasisRequest request);

    SwapEstimatedSettlementPriceResponse getSwapEstimatedSettlementPrice(String contractCode);

    BatchMergedResponse getBatchMerged(String contractCode);

    SwapMarkPriceKlineResponse getSwapMarkPriceKline(String contractCode,String period,Integer size);

    SwapLadderMarginResponse getSwapLadderMargin(String contractCode);

    SwapBatchFundingRateResponse getSwapBatchFundingRate(String contractCode);

    MarketBboResponse getMarketBbo(String contractCode);

    SwapLiquidationOrdersV3Response getSwapLiquidationOrdersV3(SwapLiquidationOrdersV3Request request);

    SwapSettlementRecordsResponse getSwapSettlementRecords(SwapSettlementRecordsRequest request);

    SwapQueryElementsResponse getSwapQueryElements(String contractCode);

    BatchMergedV2Response getBatchMergedV2(String contractCode);

    TimestampReponse getTimestamp();

    HeartBeatResponse getHeartBeat();

    SummaryResponse getSummary();
}
