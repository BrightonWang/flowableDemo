package com.brighton.flowableHalloWord;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <className>, v <versionName> 18:17 2019-07-02 Brigh Exp $
 */
public class SendRejectionMail implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("哈哈, 你被拒绝了 ===== 嘤嘤嘤=====这是演示程序就不发邮件了喵");
        System.out.println("被拒绝了也没关系, 反正这不是第一次了, 当然也不是最后一次 /手动滑稽");
        System.out.println("这是最后一个任务啦, 流程执行成功啦,撒花:-)");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
