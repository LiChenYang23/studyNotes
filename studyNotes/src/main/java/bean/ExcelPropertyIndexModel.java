package bean;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class ExcelPropertyIndexModel extends BaseRowModel {

    @ExcelProperty(value = "姓名" ,index = 0)
    private String name;

    @ExcelProperty(value = "年龄",index = 1)
    private String age;

    @ExcelProperty(value = "邮箱",index = 2)
    private String email;

    @ExcelProperty(value = "地址",index = 3)
    private String address;

    @ExcelProperty(value = "性别",index = 4)
    private String sax;

    @ExcelProperty(value = "高度",index = 5)
    private String heigh;

    @ExcelProperty(value = "备注",index = 6)
    private String last;

    public ExcelPropertyIndexModel(String name, String age, String email, String address, String sax, String heigh, String last) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.sax = sax;
        this.heigh = heigh;
        this.last = last;
    }

    public ExcelPropertyIndexModel() {
    }
}
