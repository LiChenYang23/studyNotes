package bean;

public class QuanAccount {
    /**
     * @mbg.generated 2018-09-13 10:24:47
     */
    private Long id;

    /**
     * 交易所id
     *
     * @mbg.generated 2018-09-13 10:24:47
     */
    private Integer exchangeId;

    public QuanAccount() {
    }

    public QuanAccount(Long id, Integer exchangeId, String accountName, Long accountSourceId, Long userId) {
        this.id = id;
        this.exchangeId = exchangeId;
        this.accountName = accountName;
        this.accountSourceId = accountSourceId;
        this.userId = userId;
    }

    /**
     * @mbg.generated 2018-09-13 10:24:47
     */
    private String accountName;

    /**
     * 用户id
     *
     * @mbg.generated 2018-09-13 10:24:47
     */
    private Long accountSourceId;

    /**
     * uid
     *
     * @mbg.generated 2018-09-13 10:24:47
     */
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getAccountSourceId() {
        return accountSourceId;
    }

    public void setAccountSourceId(Long accountSourceId) {
        this.accountSourceId = accountSourceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "QuanAccount{" +
                "id=" + id +
                ", exchangeId=" + exchangeId +
                ", accountName='" + accountName + '\'' +
                ", accountSourceId=" + accountSourceId +
                ", userId=" + userId +
                '}';
    }
}
