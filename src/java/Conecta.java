
import com.kurtphpr.sistema.vendas.HibernateUtil;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anderson
 */
public class Conecta {
    public static void main(String args[]){
	
		Session sessao = null;
		try{
			sessao = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Conectou!");
		}finally{
			sessao.close();
			System.out.println("Fechou conexão!");
		}	
	}
}