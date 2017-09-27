package br.com.s2it.registraPonto.controllers;

import br.com.s2it.registraPonto.vos.EmployeeVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gustavo on 22/06/17.
 */
@Controller
public class FuncionarioController {

    @RequestMapping("/")
    public String index(){
        System.out.println("passou pelo index");
        return "index";
    }

    @RequestMapping("/employee/new")
    public String employeeNew() {
        System.out.println("entrou na página");
        return "employeeNew";
    }

    @RequestMapping("/employee/add")
    public String employeeAdd(String nome, String idade) {
    //FIXME - Cadastrar mensagem
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("cadastrou");
        return "employeeNew";
    }

    public static void main(String[] args) {
        EmployeeVO vini = new EmployeeVO();
        vini.setNome("Vini");
        EmployeeVO rafa = new EmployeeVO();
        rafa.setNome("Rafa");
        EmployeeVO gu = new EmployeeVO();
        gu.setNome("Gu");

        vini = rafa;

        vini.setNome("Leo");

        vini.getNome();
        gu.getNome();
        rafa.getNome();
    }
}
