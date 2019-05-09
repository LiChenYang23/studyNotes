package bean;

import java.math.BigDecimal;
import java.util.Date;

public class TOrder {
    /**
     * 主键id
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long id;

    /**
     * 创建日期，时分秒部分全部截除
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Date createDate;

    /**
     * 用户订单ID
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long userOrderId;

    /**
     * 交易所标识
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private String exchange;

    /**
     * 合约ID
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private String instrumentId;

    /**
     * 当周, 次周, 季度
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Byte instrumentType;

    /**
     * 品种ID
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private String productId;

    /**
     * 订单所属用户id
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private String userId;

    /**
     * 计价币种
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private String quoteCurrency;

    /**
     * 杠杆倍数 5 ,  10,  20
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Integer leverRate;

    /**
     * 1:买  、 2:卖
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Byte direction;

    /**
     * 1:开 、  2:平
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Byte offset;

    /**
     *  报单类型 1:报单 、 2:撤单 、 3:爆仓、4:交割、5:初始化事件单、6:结算开始事件单、7 风控事件单、 11冻结 、 12 解冻、13 确认  、20 平账 、21 活动奖励 、22 超级返佣 、 23 邀请返佣
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Byte orderType;

    /**
     * 以张为交易单位时的订单数量
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal volume;

    /**
     * 以币为交易单位时的订单数量
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal coinVolume;

    /**
     * 限价订单订单价格
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal price;

    /**
     * 记录订单创建时间的毫秒数
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long createdAt;

    /**
     * 已处理订单数量
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal tradedVolume;

    /**
     * 已处理订单币数量
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal tradedCoinVolume;

    /**
     * 已处理订单总金额
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal tradedTurnover;

    /**
     * 已处理订单手续费
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal tradedFee;

    /**
     * 撮合完成时间
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long finishedAt;

    /**
     * 1:系统订单、2:用户网页订单、3:用户API订单、4:用户APP订单 5爆仓来源、6交割来源、7后台管理系统 8 用户ios系统订单   9 用户 android系统订单 10 用户windows系统订单  11 用户mac订单
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Byte source;

    /**
     * 订单状态：1:准备提交、2:冻结异常、3:已提交、4:部分成交、5:部分成交(已撤单)、6:完全成交、7:已撤单、 8 撤销订单未找到、 9 错单、 10 失败
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Byte state;

    /**
     * 全局订单ID,和Sequence表中的order_id对应
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long orderId;

    /**
     * 撤单时间
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long canceledAt;

    /**
     * 更新时间
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long updatedAt;

    /**
     * 爆仓单ID
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long explosionId;

    /**
     * 爆仓用户ID
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private String explosionUserId;

    /**
     * 订单价格类型 1 限价、2市价、3对手价
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Byte orderPriceType;

    /**
     * 冻结保证金
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal frozenMargin;

    /**
     * 是否已验证: 0:未验证 1:已验证
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Byte checked;

    /**
     * 本地报单编号
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long clientOrderId;

    /**
     * 收益
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal profit;

    /**
     * 队列id
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private Long fifoId;

    /**
     * 撤销订单数量
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private BigDecimal cancelVolume;

    /**
     * 撮合Id集合
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    private String matchIds;

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getId() {
        return id;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getUserOrderId() {
        return userOrderId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setUserOrderId(Long userOrderId) {
        this.userOrderId = userOrderId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public String getInstrumentId() {
        return instrumentId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Byte getInstrumentType() {
        return instrumentType;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setInstrumentType(Byte instrumentType) {
        this.instrumentType = instrumentType;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public String getProductId() {
        return productId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public String getUserId() {
        return userId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Integer getLeverRate() {
        return leverRate;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setLeverRate(Integer leverRate) {
        this.leverRate = leverRate;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Byte getDirection() {
        return direction;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setDirection(Byte direction) {
        this.direction = direction;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Byte getOffset() {
        return offset;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setOffset(Byte offset) {
        this.offset = offset;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getCoinVolume() {
        return coinVolume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setCoinVolume(BigDecimal coinVolume) {
        this.coinVolume = coinVolume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getTradedVolume() {
        return tradedVolume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setTradedVolume(BigDecimal tradedVolume) {
        this.tradedVolume = tradedVolume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getTradedCoinVolume() {
        return tradedCoinVolume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setTradedCoinVolume(BigDecimal tradedCoinVolume) {
        this.tradedCoinVolume = tradedCoinVolume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getTradedTurnover() {
        return tradedTurnover;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setTradedTurnover(BigDecimal tradedTurnover) {
        this.tradedTurnover = tradedTurnover;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getTradedFee() {
        return tradedFee;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setTradedFee(BigDecimal tradedFee) {
        this.tradedFee = tradedFee;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getFinishedAt() {
        return finishedAt;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setFinishedAt(Long finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Byte getSource() {
        return source;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setSource(Byte source) {
        this.source = source;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Byte getState() {
        return state;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getCanceledAt() {
        return canceledAt;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setCanceledAt(Long canceledAt) {
        this.canceledAt = canceledAt;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getExplosionId() {
        return explosionId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setExplosionId(Long explosionId) {
        this.explosionId = explosionId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public String getExplosionUserId() {
        return explosionUserId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setExplosionUserId(String explosionUserId) {
        this.explosionUserId = explosionUserId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Byte getOrderPriceType() {
        return orderPriceType;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setOrderPriceType(Byte orderPriceType) {
        this.orderPriceType = orderPriceType;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getFrozenMargin() {
        return frozenMargin;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setFrozenMargin(BigDecimal frozenMargin) {
        this.frozenMargin = frozenMargin;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Byte getChecked() {
        return checked;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setChecked(Byte checked) {
        this.checked = checked;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getClientOrderId() {
        return clientOrderId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setClientOrderId(Long clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public Long getFifoId() {
        return fifoId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setFifoId(Long fifoId) {
        this.fifoId = fifoId;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public BigDecimal getCancelVolume() {
        return cancelVolume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setCancelVolume(BigDecimal cancelVolume) {
        this.cancelVolume = cancelVolume;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public String getMatchIds() {
        return matchIds;
    }

    /**
     * WARNING - do not modify.
     * @mbg.generated 2018-12-18 17:15:54
     */
    public void setMatchIds(String matchIds) {
        this.matchIds = matchIds;
    }
}