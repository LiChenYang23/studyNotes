package bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class JsonBean {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * area_code : 00244
         * name_en : Angola
         * name_cn : 安哥拉
         * country_id : 1
         */

        @JSONField(name = "area_code")
        private String areaCode;
        @JSONField(name = "name_en")
        private String nameEn;
        @JSONField(name = "name_cn")
        private String nameCn;
        @JSONField(name = "country_id")
        private int countryId;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getNameEn() {
            return nameEn;
        }

        public void setNameEn(String nameEn) {
            this.nameEn = nameEn;
        }

        public String getNameCn() {
            return nameCn;
        }

        public void setNameCn(String nameCn) {
            this.nameCn = nameCn;
        }

        public int getCountryId() {
            return countryId;
        }

        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }

        @Override
        public String toString() {
            return "ListBean{" +
                    "areaCode='" + areaCode + '\'' +
                    ", nameEn='" + nameEn + '\'' +
                    ", nameCn='" + nameCn + '\'' +
                    ", countryId=" + countryId +
                    '}';
        }
    }
}
