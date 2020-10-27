package com.epam.task.eighth.parser.SAX;

import com.epam.task.eighth.model.AbstractTouristVoucher;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;

public class DevicesHandler extends DefaultHandler {
    private final static String EXCURSION_VOUCHER = "excursion-voucher";
    private final static String PILGRIMAGE_VOUCHER = "pilgrimage-voucher";
    private final static String VOCATION_VOUCHER = "vocation-voucher";

    private final static String ID = "id";
    private final static String TRANSPORT = "transport";
    private final static String COST= "cost";
    private final static String DAY = "day";
    private final static String COUNTRY = "country";
    private final static String HOTEL_STAR = "hotel-star";
    private final static String SEA_DISTANCE = "sea-distance";
    private final static String GUIDE = "guide";
    private final static String MAIN_ATTRACTION = "main-attraction";
    private final static String COST_BONUS_SERVICE = "cost-bonus-service";
    private final static String NUMBERS_STOP = "numbers-stop";

    private List<AbstractTouristVoucher> vouchers;
    private AbstractTouristVoucher current = null;
    private String currentField = null;

    public List<AbstractTouristVoucher> getVouchers(){
        return vouchers;
    }


}
