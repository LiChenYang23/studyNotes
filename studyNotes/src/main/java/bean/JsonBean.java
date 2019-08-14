package bean;

import java.util.List;

public class JsonBean {

    /**
     * msg : success
     * code : 0
     * detailMsg :
     * data : {"symbol":0,"futureRiskWeek":[{"amount":1636.0737,"contractId":201909270000013,"contractType":1,"createDate":1565682600000,"dayOffset":1332,"id":9653,"symbol":0,"type":2,"value":0.7015},{"amount":1635.3722,"contractId":201909270000013,"contractType":1,"createDate":1565596200000,"dayOffset":1331,"id":9650,"symbol":0,"type":2,"value":4.4343},{"amount":1630.9379,"contractId":201909270000013,"contractType":1,"createDate":1565509800000,"dayOffset":1330,"id":9647,"symbol":0,"type":2,"value":12.168},{"amount":1618.7699,"contractId":201909270000013,"contractType":1,"createDate":1565423400000,"dayOffset":1329,"id":9644,"symbol":0,"type":2,"value":4.9081},{"amount":1613.8618,"contractId":0,"contractType":0,"createDate":1565338152000,"dayOffset":1328,"id":9641,"symbol":0,"type":1,"value":1.3395},{"amount":1615.2013,"contractId":201909270000013,"contractType":1,"createDate":1565337000000,"dayOffset":1327,"id":9640,"symbol":0,"type":2,"value":5.2821},{"amount":1609.9192,"contractId":201909270000013,"contractType":1,"createDate":1565250600000,"dayOffset":1326,"id":9637,"symbol":0,"type":2,"value":8.7523},{"amount":1601.1669,"contractId":201909270000013,"contractType":1,"createDate":1565164200000,"dayOffset":1325,"id":9634,"symbol":0,"type":2,"value":13.0684},{"amount":1588.0985,"contractId":201909270000013,"contractType":1,"createDate":1565077800000,"dayOffset":1324,"id":9631,"symbol":0,"type":2,"value":8.5578},{"amount":1579.5407,"contractId":201909270000013,"contractType":1,"createDate":1564991400000,"dayOffset":1323,"id":9628,"symbol":0,"type":2,"value":17.6757}],"pageBean":{"allRecordList":[],"currentList":[],"currentPage":1,"currentRecordLength":0,"currentRecordList":[],"endItemIndex":10,"maxTotalPages":200,"pageLength":10,"startItemIndex":1,"startItemIndex2":0,"totalPages":134,"totalResults":1332}}
     */

    private String msg;
    private int code;
    private String detailMsg;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDetailMsg() {
        return detailMsg;
    }

    public void setDetailMsg(String detailMsg) {
        this.detailMsg = detailMsg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * symbol : 0
         * futureRiskWeek : [{"amount":1636.0737,"contractId":201909270000013,"contractType":1,"createDate":1565682600000,"dayOffset":1332,"id":9653,"symbol":0,"type":2,"value":0.7015},{"amount":1635.3722,"contractId":201909270000013,"contractType":1,"createDate":1565596200000,"dayOffset":1331,"id":9650,"symbol":0,"type":2,"value":4.4343},{"amount":1630.9379,"contractId":201909270000013,"contractType":1,"createDate":1565509800000,"dayOffset":1330,"id":9647,"symbol":0,"type":2,"value":12.168},{"amount":1618.7699,"contractId":201909270000013,"contractType":1,"createDate":1565423400000,"dayOffset":1329,"id":9644,"symbol":0,"type":2,"value":4.9081},{"amount":1613.8618,"contractId":0,"contractType":0,"createDate":1565338152000,"dayOffset":1328,"id":9641,"symbol":0,"type":1,"value":1.3395},{"amount":1615.2013,"contractId":201909270000013,"contractType":1,"createDate":1565337000000,"dayOffset":1327,"id":9640,"symbol":0,"type":2,"value":5.2821},{"amount":1609.9192,"contractId":201909270000013,"contractType":1,"createDate":1565250600000,"dayOffset":1326,"id":9637,"symbol":0,"type":2,"value":8.7523},{"amount":1601.1669,"contractId":201909270000013,"contractType":1,"createDate":1565164200000,"dayOffset":1325,"id":9634,"symbol":0,"type":2,"value":13.0684},{"amount":1588.0985,"contractId":201909270000013,"contractType":1,"createDate":1565077800000,"dayOffset":1324,"id":9631,"symbol":0,"type":2,"value":8.5578},{"amount":1579.5407,"contractId":201909270000013,"contractType":1,"createDate":1564991400000,"dayOffset":1323,"id":9628,"symbol":0,"type":2,"value":17.6757}]
         * pageBean : {"allRecordList":[],"currentList":[],"currentPage":1,"currentRecordLength":0,"currentRecordList":[],"endItemIndex":10,"maxTotalPages":200,"pageLength":10,"startItemIndex":1,"startItemIndex2":0,"totalPages":134,"totalResults":1332}
         */

        private int symbol;
        private PageBeanBean pageBean;
        private List<FutureRiskWeekBean> futureRiskWeek;

        public int getSymbol() {
            return symbol;
        }

        public void setSymbol(int symbol) {
            this.symbol = symbol;
        }

        public PageBeanBean getPageBean() {
            return pageBean;
        }

        public void setPageBean(PageBeanBean pageBean) {
            this.pageBean = pageBean;
        }

        public List<FutureRiskWeekBean> getFutureRiskWeek() {
            return futureRiskWeek;
        }

        public void setFutureRiskWeek(List<FutureRiskWeekBean> futureRiskWeek) {
            this.futureRiskWeek = futureRiskWeek;
        }

        public static class PageBeanBean {
            /**
             * allRecordList : []
             * currentList : []
             * currentPage : 1
             * currentRecordLength : 0
             * currentRecordList : []
             * endItemIndex : 10
             * maxTotalPages : 200
             * pageLength : 10
             * startItemIndex : 1
             * startItemIndex2 : 0
             * totalPages : 134
             * totalResults : 1332
             */

            private int currentPage;
            private int currentRecordLength;
            private int endItemIndex;
            private int maxTotalPages;
            private int pageLength;
            private int startItemIndex;
            private int startItemIndex2;
            private int totalPages;
            private int totalResults;
            private List<?> allRecordList;
            private List<?> currentList;
            private List<?> currentRecordList;

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public int getCurrentRecordLength() {
                return currentRecordLength;
            }

            public void setCurrentRecordLength(int currentRecordLength) {
                this.currentRecordLength = currentRecordLength;
            }

            public int getEndItemIndex() {
                return endItemIndex;
            }

            public void setEndItemIndex(int endItemIndex) {
                this.endItemIndex = endItemIndex;
            }

            public int getMaxTotalPages() {
                return maxTotalPages;
            }

            public void setMaxTotalPages(int maxTotalPages) {
                this.maxTotalPages = maxTotalPages;
            }

            public int getPageLength() {
                return pageLength;
            }

            public void setPageLength(int pageLength) {
                this.pageLength = pageLength;
            }

            public int getStartItemIndex() {
                return startItemIndex;
            }

            public void setStartItemIndex(int startItemIndex) {
                this.startItemIndex = startItemIndex;
            }

            public int getStartItemIndex2() {
                return startItemIndex2;
            }

            public void setStartItemIndex2(int startItemIndex2) {
                this.startItemIndex2 = startItemIndex2;
            }

            public int getTotalPages() {
                return totalPages;
            }

            public void setTotalPages(int totalPages) {
                this.totalPages = totalPages;
            }

            public int getTotalResults() {
                return totalResults;
            }

            public void setTotalResults(int totalResults) {
                this.totalResults = totalResults;
            }

            public List<?> getAllRecordList() {
                return allRecordList;
            }

            public void setAllRecordList(List<?> allRecordList) {
                this.allRecordList = allRecordList;
            }

            public List<?> getCurrentList() {
                return currentList;
            }

            public void setCurrentList(List<?> currentList) {
                this.currentList = currentList;
            }

            public List<?> getCurrentRecordList() {
                return currentRecordList;
            }

            public void setCurrentRecordList(List<?> currentRecordList) {
                this.currentRecordList = currentRecordList;
            }
        }

        public static class FutureRiskWeekBean {
            /**
             * amount : 1636.0737
             * contractId : 201909270000013
             * contractType : 1
             * createDate : 1565682600000
             * dayOffset : 1332
             * id : 9653
             * symbol : 0
             * type : 2
             * value : 0.7015
             */

            private double amount;
            private long contractId;
            private int contractType;
            private long createDate;
            private int dayOffset;
            private int id;
            private int symbol;
            private int type;
            private double value;

            public double getAmount() {
                return amount;
            }

            public void setAmount(double amount) {
                this.amount = amount;
            }

            public long getContractId() {
                return contractId;
            }

            public void setContractId(long contractId) {
                this.contractId = contractId;
            }

            public int getContractType() {
                return contractType;
            }

            public void setContractType(int contractType) {
                this.contractType = contractType;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public int getDayOffset() {
                return dayOffset;
            }

            public void setDayOffset(int dayOffset) {
                this.dayOffset = dayOffset;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getSymbol() {
                return symbol;
            }

            public void setSymbol(int symbol) {
                this.symbol = symbol;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public double getValue() {
                return value;
            }

            public void setValue(double value) {
                this.value = value;
            }
        }
    }
}
