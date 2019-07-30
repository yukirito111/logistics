package com.yuantu.logisticsmanagement;

/*

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
*/
/*
public class LogisticsmanagementApplicationTests {
    @Autowired
    SelectManagementSituationByDate selectManagementSituationByDate;
    @Autowired
    SelectPaymentByPaymentType selectPaymentByPaymentType;
    @Autowired
    SelectPaymentByDate selectPaymentByDate;
    @Autowired
    SelectTotalPaymentMoney selectTotalPaymentMoney;
    @Autowired
    SelectCostProfitByDate selectCostProfitByDate;
    @Autowired
    SelectCostProfitByNumber selectCostProfitByNumber;
    @Autowired
    SelectAccountlnformationByName selectAccountlnformationByName;
    @Autowired
    SelectAccount selectAccount;
    @Autowired
    InsertUpdateAccount insertUpdateAccount;
    @Autowired
    SelectUpdateAccount selectUpdateAccount;
    @Autowired
    SelectReceiptByDate selectReceiptByDate;
    @Autowired
    SelectAllReceipt selectAllReceipt;
    @Autowired
    SelectTotalActualReceiptMoney selectTotalActualReceiptMoney;

    @Autowired
    InsertShipping insertShipping;
    @Autowired
    InsertReceive insertReceive;
    @Autowired
    SelectShipping selectShipping;
    @Autowired
    InsertStore insertStore;
    @Autowired
    SelectStorehouse selectStorehouse;
    @Autowired
    SelectStorehouseByDate selectStorehouseByDate;

    @Test
    public void contextLoads() {
    }
*//*


*/
/*    @Test
    public void showManagementSituation() {
        Date startDate = conversion("2019-1-1");
        Date endDate = conversion("2019-1-20");
        List<MeslManagementSituationVO> list = selectManagementSituationByDate.selectManagementSituationByDate(startDate, endDate);
        for (MeslManagementSituationVO meslManagementSituationVO : list) {
            log.info("查询结果：{}", meslManagementSituationVO.getDeptNumber() + meslManagementSituationVO.getManagementSituationDate() );
        }
    }
    @Test
    public void showPayment(){
        List<MeslPayment> list = selectPaymentByPaymentType.selectPaymentByPaymentType("1");
        for (MeslPayment meslPayment: list
             ) {
            log.info("查询结果：{}",meslPayment.getId() + meslPayment.getPaymentNumber() + meslPayment.getPaymentType() + meslPayment.getPaymentDate() + meslPayment.getPaymentMoney() + meslPayment.getPaymentPerson() + meslPayment.getPaymentAccount());
        }
    }
    @Test
    public  void showPaymentByDate(){
        MeslPayment meslPayment = selectPaymentByDate.selectPaymentByDateByDate("1","1");
        log.info("查询结果：{}",meslPayment.getId() + meslPayment.getPaymentNumber() + meslPayment.getPaymentType() + meslPayment.getPaymentDate() + meslPayment.getPaymentMoney() + meslPayment.getPaymentPerson() + meslPayment.getPaymentAccount());
    }
    @Test
    public void showTotal(){
        double sum = selectTotalPaymentMoney.selectTotalPaymentMoney("1");
        //log.info("求和结果：",sum);
        System.out.println("求和结果："+sum);
    }
    @Test
    public  void showCostProfitByDate(){
        Date startDate = conversion("2019-1-1");
        Date endDate = conversion("2019-1-20");
        List<MeslCostProfit> list = selectCostProfitByDate.selectCostProfitByDate(startDate,endDate);
        for (MeslCostProfit meslCostProfit:list
             ) {
           //log.info("查询结果：{}",meslCostProfit.getId() + meslCostProfit.getCostProfitDate() + meslCostProfit.getDeptNumber() + meslCostProfit.getTotalExpend() + meslCostProfit.getTotalIncome() + meslCostProfit.getTotalProfit());
            log.info("查询结果：{}",meslCostProfit.getId() + meslCostProfit.getDeptNumber() + meslCostProfit.getCostProfitDate()+ meslCostProfit.getTotalExpend() + meslCostProfit.getTotalIncome() + meslCostProfit.getTotalProfit());

        }
    }*//*

   */
/* @Test
    public void showCostProfitByNumber(){
        Date startDate = conversion("2019-1-1");
        Date endDate = conversion("2019-1-20");
        List<MeslCostProfit> list = selectCostProfitByNumber.selectCostProfitByNumber("1",startDate,endDate);
        for (MeslCostProfit meslCostProfit:list
             ) {
            log.info("查询结果：{}",meslCostProfit.getId() + meslCostProfit.getDeptNumber() + meslCostProfit.getCostProfitDate()+ meslCostProfit.getTotalExpend() + meslCostProfit.getTotalIncome() + meslCostProfit.getTotalProfit());
        }
    }
    @Test
    public void showAccountInformationByName(){
       MeslAccountInformation meslAccountInformation = selectAccountlnformationByName.selectAccountlnformationByName("1");
       log.info("查询结果：{}",meslAccountInformation.getId() + meslAccountInformation.getAccountName() + meslAccountInformation.getAccountMoney());
    }*//*

  */
/*  @Test
    public void showAccount(){
        MeslAccount meslAccount = selectAccount.selectAccount();
        log.info("查询结果：{}",meslAccount.getId() + meslAccount.getDept() + meslAccount.getPersonnel() + meslAccount.getTrucks() + meslAccount.getStock() +  meslAccount.getAccountName() + meslAccount.getAccountMoney());
    }*//*

  */
/*  @Test
    public void setUpdateAccount(){
        insertUpdateAccount.updateAccount("1","1","1","1","1","1");
    }*//*

  */
/*  @Test
    public void showUpdateAccount(){
       MeslAccountUpdate meslAccountUpdate = selectUpdateAccount.selectUpdateAccount();
       log.info("查询结果：{}",meslAccountUpdate.getUpdateDept() + meslAccountUpdate.getUpdatePersonnel() + meslAccountUpdate.getUpdateTrucks() + meslAccountUpdate.getUpdateStock() + meslAccountUpdate.getUpdateAccountName() + meslAccountUpdate.getUpdateAccountMoney());
    }*//*

    @Test
    public void showReceiptByDate(){
        MeslReceipt meslReceipt = selectReceiptByDate.selectReceiptByDate("1");
        log.info("查询结果：{}", meslReceipt.getStaffNumber() + meslReceipt.getActualReceiptMoney());
    }
    @Test
    public void showAllReceipt(){
        List<MeslReceipt> list = selectAllReceipt.selectAllReceipt();
        for (MeslReceipt meslReceipt:list
             ) {
            log.info("查询结果：{}",meslReceipt.getStaffNumber() + meslReceipt.getActualReceiptMoney());
        }
    }
    @Test
    public void showTotalActualReceiptMoney(){
        double sum = selectTotalActualReceiptMoney.selectTotalActualReceiptMoney();
        System.out.println("求和结果："+sum);
    }
   */
/* @Test
    public void insertMail(){
        String state = insertMail.insertMail();
        //System.out.println(state);
    }*//*


    @Test
    public void setInsertShipping(){
        insertShipping.insertShipping("1","1","1","1","1","1","1","1","1");
    }
    @Test
    public void insertReceive(){
        insertReceive.insertReceive("1","1","1","1","1","1");
    }
    @Test
    public void selectShipping(){
        List<MeslShipping> list = selectShipping.selectShipping();
        for (MeslShipping meslShipping:list
             ) {
            log.info("查询结果：{}",meslShipping.getShippingorderNumber() + meslShipping.getShippingTime() + meslShipping.getTrainNumber() + meslShipping.getOrigin() + meslShipping.getDestination() + meslShipping.getCarriageNumber() + meslShipping.getOperator() + meslShipping.getFreightBatchNumber() + meslShipping.getFreight());
        }
    }
    */
/*@Test
    public void setInsertStore(@RequestBody String expressorderNumber ,@RequestBody Date date,@RequestBody String destination,@RequestBody String areaCode,@RequestBody String rowCode,@RequestBody String shelvesCode,@RequestBody String seatCode){
        insertStore.insertStore(expressorderNumber,date,destination,areaCode,rowCode,shelvesCode,seatCode);
    }*//*

    @Test
    public void setSelectStorehouse(){
        List<MeslIntoStorehouse>list = selectStorehouse.selectStorehouse();
        for (MeslIntoStorehouse meslIntoStorehouse:list
             ) {
            log.info("查询结果：{}",meslIntoStorehouse.getExpressorderNumber() + meslIntoStorehouse.getIntoStorehouseDate() + meslIntoStorehouse.getDestination() + meslIntoStorehouse.getAreaCode() + meslIntoStorehouse.getRowCode() + meslIntoStorehouse.getShelvesCode() + meslIntoStorehouse.getSeatCode());
        }
    }
    @Test
    public void selectStorehouseByDate(){
       Date startDate = conversion("2019-1-1");
       Date endDate =conversion("2019-1-20");
        MeslIntoStorehouse meslIntoStorehouse = selectStorehouseByDate.selectStorehouseByDate(startDate,endDate);
        log.info("查询结果：{}",meslIntoStorehouse.getExpressorderNumber() + meslIntoStorehouse.getIntoStorehouseDate() + meslIntoStorehouse.getDestination() + meslIntoStorehouse.getAreaCode() + meslIntoStorehouse.getRowCode() + meslIntoStorehouse.getShelvesCode() + meslIntoStorehouse.getSeatCode());
    }
}
*/
