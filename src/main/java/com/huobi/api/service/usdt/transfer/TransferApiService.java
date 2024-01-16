package com.huobi.api.service.usdt.transfer;


import com.huobi.api.request.usdt.transfer.UsdtSwapTransferRequest;
import com.huobi.api.response.usdt.transfer.UsdtSwapTransferResponse;

public interface TransferApiService {

    UsdtSwapTransferResponse transfer(UsdtSwapTransferRequest request);
}
