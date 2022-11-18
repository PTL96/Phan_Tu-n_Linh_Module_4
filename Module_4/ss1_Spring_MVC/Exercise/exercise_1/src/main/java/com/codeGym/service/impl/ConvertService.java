package com.codeGym.service.impl;

import org.springframework.stereotype.Service;
import com.codeGym.service.IConvertService;

@Service
public class ConvertService implements IConvertService {
    @Override
    public double result(int usd, int rate) {
        return usd*rate;
    }
}
