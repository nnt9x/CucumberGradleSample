package com.bkacad.cucumber.steps;

import com.bkacad.cucumber.MayTinh;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MayTinhSteps {
    private MayTinh mayTinh;
    private long tmp;

    @Given("khoi tao may tinh")
    public void khoiTaoMayTinh() {
        mayTinh = new MayTinh();
    }

    @When("tong cua {long} va {long}")
    public void tinhTong(long a, long b) {
        tmp = mayTinh.cong(a, b);
    }

    @Then("ket qua bang {long}")
    public void ketQuaBang(long rs) {
        Assertions.assertEquals(rs, tmp);
    }
}
