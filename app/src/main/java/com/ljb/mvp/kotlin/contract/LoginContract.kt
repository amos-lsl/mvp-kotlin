package com.ljb.mvp.kotlin.contract

import com.ljb.mvp.kotlin.mvp.contract.IPresenterContract
import com.ljb.mvp.kotlin.mvp.contract.IViewContract

/**
 * 登录页View层\Presenter层通讯契约接口
 * Created by L on 2017/7/13.
 */
interface LoginContract {

    interface IView : IViewContract {
        fun loginSuccess()
        fun loginError(errorMsg: String?)
        fun goHome()
    }

    interface IPresenter : IPresenterContract {
        fun login(userName: String)
        fun delayGoHomeTask()
    }
}