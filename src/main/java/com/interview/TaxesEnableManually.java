package com.interview;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxesEnableManually {

    public static final String HOTEL_SETTING_TABLE = "ALLHOTDB.HOTEL_SETTINGS";

    public static final String DELETE_NEW_TAXRULE_FLAG_SQL =
            "DELETE FROM " + HOTEL_SETTING_TABLE + "\n"+
                    "       WHERE HOTELID = {0,number,#}" + "\n" +
                    "		AND SETTING_TYPE = {1};";

    public static final String SET_NEW_TAXRULE_FLAG_SQL =
            "INSERT INTO " + HOTEL_SETTING_TABLE + "\n"+
                    "		(HOTELID, SETTING_TYPE,  \n" +
                    "		SETTING_NUMVALUE, SETTING_CHARVALUE) \n" +
                    "   	VALUES ({0,number,#}, 214, \n " +
                    "		1, {1});";

    public static void main(String[] args) {

        String sb = "12120," +
                "1476," +
                "1454," +
                "1499," +
                "1409," +
                "1468," +
                "1484," +
                "114748," +
                "1428," +
                "1461," +
                "1447," +
                "1423," +
                "1479," +
                "1475," +
                "1457," +
                "1430," +
                "17839," +
                "1446," +
                "1429," +
                "1490," +
                "1412," +
                "95934," +
                "1011," +
                "114731," +
                "1443," +
                "1425," +
                "114617," +
                "1426," +
                "1495," +
                "112959," +
                "1449," +
                "1408," +
                "1481," +
                "1410," +
                "1212," +
                "1462," +
                "114744," +
                "1477," +
                "114743," +
                "1420," +
                "1445," +
                "1494," +
                "98901," +
                "1487," +
                "1415," +
                "114727," +
                "1466," +
                "1478," +
                "1482," +
                "1470," +
                "1459," +
                "1427," +
                "1488," +
                "1442," +
                "114752," +
                "12111," +
                "1456," +
                "1492," +
                "1467," +
                "1441," +
                "114751," +
                "1421," +
                "1450," +
                "114742," +
                "1465," +
                "1424," +
                "1497," +
                "1480," +
                "1422," +
                "114749," +
                "1416," +
                "114739," +
                "114745," +
                "1483," +
                "1474," +
                "1411," +
                "1400," +
                "114741," +
                "1455," +
                "114746," +
                "1418," +
                "1401," +
                "114753," +
                "114486," +
                "114747," +
                "1419," +
                "1463," +
                "1471," +
                "1301," +
                "114738," +
                "1493," +
                "114729," +
                "1473," +
                "1444," +
                "1448," +
                "1489," +
                "1464," +
                "1472," +
                "17138," +
                "114740," +
                "98899," +
                "1458," +
                "1406," +
                "1407," +
                "1469," +
                "12110," +
                "1486," +
                "1498," +
                "1485," +
                "1491," +
                "1001," +
                "1417," +
                "1496";

        String[] convertedRankArray = sb.split(",");
        List<Integer> expectedRanksList = new ArrayList<Integer>();
        for (String number : convertedRankArray) {
            expectedRanksList.add(Integer.parseInt(number.trim()));
        }

        for(Integer hotelId : expectedRanksList) {
            String deleteSql = MessageFormat.format(DELETE_NEW_TAXRULE_FLAG_SQL,
                    hotelId,
                    214);
            System.out.println(deleteSql);
            System.out.println();
            System.out.println();
        }

        System.out.println("---------------------------");
        for(Integer hotelId : expectedRanksList) {
        String insertSql = MessageFormat.format(SET_NEW_TAXRULE_FLAG_SQL,
                hotelId,
                "\'08-Dec-2021\'");
            System.out.println(insertSql);
            System.out.println();
            System.out.println();
        }




    }
}
