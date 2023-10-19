package com.showcase.domain.event;

//@EqualsAndHashCode(callSuper = true)
//@Data
public class SalaryAdjustEvent {

    public static String TOPIC = "xfg-mq";

    public static SalaryAdjustEvent create(Object  adjustSalaryApplyOrderAggregate) {
        SalaryAdjustEvent event = new SalaryAdjustEvent();
//        event.setId(RandomStringUtils.randomNumeric(11));
//        event.setTimestamp(new Date());
//        event.setData(adjustSalaryApplyOrderAggregate);
        return event;
    }

}