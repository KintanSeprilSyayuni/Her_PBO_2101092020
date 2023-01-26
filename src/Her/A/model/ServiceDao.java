/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Her.A.model;

import java.util.List;

/**
 *
 * @author User
 */
public interface ServiceDao {
    Service save(Service service);
    Service update(int index, Service service);
    void delete(int index);
    Service getService(int index);
    List<Service>getAllService();
    Service Hitung(int hasil);
}