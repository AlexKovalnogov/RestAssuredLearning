package com.form.restApi.testExecutor;

import com.form.restApi.reqExecutor.RequestExecutor;
import com.form.restApi.requestSpecCreator.RequestSpecificationCreator;
import org.testng.annotations.*;

public class MyTestExecutor {
    protected RequestExecutor requestExecutor;
    protected RequestSpecificationCreator requestSpecificationCreator;

    @BeforeMethod
    public void initilization() {
        requestExecutor = new RequestExecutor();
        requestSpecificationCreator = new RequestSpecificationCreator();
    }
}
