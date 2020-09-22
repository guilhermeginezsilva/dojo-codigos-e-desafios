package br.com.g2stecnologia;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class DatadogServerImplTest {

    DatadogServerImpl datadogServer = new DatadogServerImpl();

    @Test
    public void shouldGetAllEvents() {
        LocalDateTime date_2020_09_01__01_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 1, 1, 10);
        LocalDateTime date_2020_09_02__01_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 2, 1, 10);
        LocalDateTime date_2020_09_03__01_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 3, 1, 10);
        LocalDateTime date_2020_09_04__01_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 4, 1, 10);
        LocalDateTime date_2020_09_05__05_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 5, 5, 10);
        LocalDateTime date_2020_09_05__05_20 = LocalDateTime.of(2020, Month.SEPTEMBER, 5, 5, 20);
        LocalDateTime date_2020_09_05__05_30 = LocalDateTime.of(2020, Month.SEPTEMBER, 5, 5, 30);
        LocalDateTime date_2020_09_05__06_01 = LocalDateTime.of(2020, Month.SEPTEMBER, 5, 6, 01);

        datadogServer.counter.addAll(Arrays.asList(
                date_2020_09_01__01_10,
                date_2020_09_02__01_10,
                date_2020_09_03__01_10,
                date_2020_09_04__01_10,
                date_2020_09_05__05_10,
                date_2020_09_05__05_20,
                date_2020_09_05__05_30,
                date_2020_09_05__06_01
        ));

        long count = datadogServer.getCounter(date_2020_09_01__01_10, date_2020_09_05__06_01);

        Assert.assertEquals(8l, count);
    }

    @Test
    public void shouldGetPartialEvents() {
        LocalDateTime date_2020_09_01__01_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 1, 1, 10);
        LocalDateTime date_2020_09_02__01_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 2, 1, 10);
        LocalDateTime date_2020_09_03__01_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 3, 1, 10);
        LocalDateTime date_2020_09_04__01_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 4, 1, 10);
        LocalDateTime date_2020_09_05__05_10 = LocalDateTime.of(2020, Month.SEPTEMBER, 5, 5, 10);
        LocalDateTime date_2020_09_05__05_20 = LocalDateTime.of(2020, Month.SEPTEMBER, 5, 5, 20);
        LocalDateTime date_2020_09_05__05_30 = LocalDateTime.of(2020, Month.SEPTEMBER, 5, 5, 30);
        LocalDateTime date_2020_09_05__06_01 = LocalDateTime.of(2020, Month.SEPTEMBER, 5, 6, 01);

        datadogServer.counter.addAll(Arrays.asList(
                date_2020_09_01__01_10,
                date_2020_09_02__01_10,
                date_2020_09_03__01_10,
                date_2020_09_04__01_10,
                date_2020_09_05__05_10,
                date_2020_09_05__05_20,
                date_2020_09_05__05_30,
                date_2020_09_05__06_01
        ));

        long count = datadogServer.getCounter(date_2020_09_01__01_10, date_2020_09_03__01_10);
        Assert.assertEquals(3l, count);

        count = datadogServer.getCounter(date_2020_09_05__05_10, date_2020_09_05__06_01);
        Assert.assertEquals(4l, count);
    }
}