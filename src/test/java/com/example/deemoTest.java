package com.example;

import com.DemoApplication;
import com.alibaba.fastjson.JSON;
import com.bean.clients.*;
import com.entity.ClientsEntity;
import com.repository.clients.clientsRepository;
import  com.repository.dataAnalysis.dataAnalysisRepository;
import com.service.clients.cliensService;
import com.service.dataAnalysis.dataAnalysisService;
import com.serviceImpl.clients.ClientsImpl;
import com.serviceImpl.dataAnalysis.DataAnalysisImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.text.SimpleDateFormat;
import java.util.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)

public class deemoTest {
    @Autowired
    cliensService cliensService = new ClientsImpl();
    @Autowired
    dataAnalysisService dataAnalysisRepository=new DataAnalysisImpl();
    @Autowired
    clientsRepository clientsRepository;
    @Autowired
    private dataAnalysisRepository dataAnalysisRepositorys;
    @Test
    public void addTest() {
        ClientsEntity addClientEntity =new ClientsEntity();
        addClientEntity.setId("12");
        addClientEntity.setClientsNumber("test");
        addClientEntity.setClientsName("test");
        addClientEntity.setClientsType("test");
        addClientEntity.setBalance(100);
        addClientEntity.setClientsContact("test");
        addClientEntity.setClientsSex("test");
        addClientEntity.setClientsPost("test");
        addClientEntity.setContactInformation("test");
        addClientEntity.setMail("test");
        addClientEntity.setRemarks("test");
        addClientEntity.setOther("test");
        System.out.println(addClientEntity.getBalance());
        System.out.println(addClientEntity.getClientsNumber());
        System.out.println(addClientEntity.getClientsPost());
        clientsRepository.save(addClientEntity);

        }
    @Test
    public void getSingleClient(){
        String clientsNumber="test";
        List<ClientsEntity> get=clientsRepository.findOneByClientsNumber(clientsNumber);
        ClientsEntity client = get.get(0);
        System.out.println(client.getId());
    }

    @Test
    public void getClients(){

        GetClientsBean getClients=new GetClientsBean();
        String[] in={"TS","test","aa"};

        getClients.setSorter("clientsType");getClients.setClientsType(in);getClients.setStartIndex(0);getClients.setNum(1);getClients.setDesc(0);
        List<ClientsListBean> clientbean=cliensService.getCLients(getClients).getClientsList();
        System.out.println(clientbean);
        System.out.println(clientbean.size());
        for(int i=0;i<clientbean.size();i++){
            System.out.println(clientbean.get(i).getClientsName());
        }

    }

    @Test
    public void updateClient(){

        UpdateSingleClientBean updateC=new UpdateSingleClientBean();
        String clientsNumber="add";
        updateC.setClientsNumber("add");
        updateC.setClientsName("pbb");
        updateC.setClientsContact("1234567");
        updateC.setClientsPost("aaa");
        updateC.setClientsSex("男");
        updateC.setClientsType("TS");
        updateC.setContactInformation("tyty");
        updateC.setMail("mail");
        updateC.setOther("无");
        updateC.setRemarks("无");
        cliensService.updateSingleClientByClientNumber(updateC,clientsNumber);


    }

    @Test
    public void deleteClient(){
        String clientsNumber="TS";

        cliensService.deleteSingleClientByClientNumber(clientsNumber);


    }

    @Test
    public void getDayPerBrand(){
        String date="20200527";
        ArrayList<String> getData=dataAnalysisRepositorys.countLastDaySalesByBrand(date);
        System.out.println(getData);
    }

    @Test
    public void getDaySales(){
        String date="20200528";
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        Object a1= dataAnalysisRepositorys.countSalesByClient0(date);
        Object a2= dataAnalysisRepositorys.countLastdaySalesByClient0(date);

        double d1 = a1 == null ? 0 : Double.parseDouble(a1.toString());
        double d2 = a2 == null ? 0 : Double.parseDouble(a2.toString());
        double increase1=d1-d2;
        System.out.println(increase1);
        map1.put("num",d1);
        map1.put("increase", increase1);

        Map<String, Object> map2 = new HashMap<String, Object>();
        Object a3= dataAnalysisRepositorys.countSalesByClientTS(date);
        Object a4= dataAnalysisRepositorys.countLastdaySalesByClientTS(date);

        double d3 = a3 == null ? 0 : Double.parseDouble(a3.toString());
        double d4 = a4 == null ? 0 : Double.parseDouble(a4.toString());

        double increase2=d3-d4;
        map2.put("num",d3);
        map2.put("increase", increase2);

        Map<String, Object> map3 = new HashMap<String, Object>();
        Object a5= dataAnalysisRepositorys.countSalesByClientPF(date);
        Object a6= dataAnalysisRepositorys.countLastdaySalesByClientPF(date);

        double d5 = a5 == null ? 0 : Double.parseDouble(a5.toString());
        double d6 = a6 == null ? 0 : Double.parseDouble(a6.toString());


        double increase3=d5-d6;
        map3.put("num",d5);
        map3.put("increase", increase3);

        list.add(map1);
        list.add(map2);
        list.add(map3);
        String mapJson = JSON.toJSONString(list);
        System.out.println(mapJson);
    }
    @Test
    public void  getDayPerState(){
        String date="20200527";
        for(int i=0;i<dataAnalysisRepository.getDayPerState(date).length;i++) {
            System.out.println(dataAnalysisRepository.getDayPerState(date)[i]);
        }
    }

    @Test
    public void  getDayPerHour(){
        String date="20200527";
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        ArrayList<String[]> getData=dataAnalysisRepositorys.getTodayperHour(date);
        int total1=getData.size();
        System.out.println(getData.get(0));
        for (int i = 0; i < total1; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("hour", Integer.valueOf(getData.get(i)[0]));
            System.out.println(Integer.valueOf(getData.get(i)[0]));
            map.put("num", Integer.valueOf(getData.get(i)[1]));
            System.out.println(Integer.valueOf(getData.get(i)[1]));
            map.put("sales", Double.valueOf(getData.get(i)[2]));
            System.out.println(Double.valueOf(getData.get(i)[2]));
            map.put("income", Double.valueOf(getData.get(i)[3]));
            System.out.println(Double.valueOf(getData.get(i)[3]));
            list.add(map);
            //map.clear();
        }
        String mapJson = JSON.toJSONString(list);

        System.out.println(mapJson);

    }
}
