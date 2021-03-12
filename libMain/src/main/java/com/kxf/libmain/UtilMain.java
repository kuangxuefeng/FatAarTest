package com.kxf.libmain;

import com.kxf.libfirst.UtilOne;
import com.kxf.libthree.UtilThree;
import com.kxf.libtwo.UtilTwo;

/**
 * @ProjectName: FatAarTest
 * @Package: com.kxf.libmain
 * @ClassName: UtilMain
 * @Description: java类作用描述
 * @Author: kuangxuefeng
 * @qq: 1024883177
 * @CreateDate: 2021/3/12 11:26
 */
public class UtilMain {
    public static String getInfo(){
        return "我是 UtilMain" + "&&&" + UtilOne.getInfo() + "&&&" + UtilTwo.getInfo() + "&&&" + UtilThree.Companion.getInfo();
    }
}
