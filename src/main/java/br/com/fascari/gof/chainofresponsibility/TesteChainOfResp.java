package br.com.fascari.gof.chainofresponsibility;

import br.com.fascari.gof.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.fascari.gof.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.fascari.gof.chainofresponsibility.middlewares.Middleware;
import br.com.fascari.gof.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteChainOfResp {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("master@teste.com.br", "abc.123");
        server.registerUser("user@teste.com.br", "123456");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        System.out.println("Digite o e-mail: ");
        String email = reader.readLine();
        System.out.println("Digite sua senha: ");
        String password = reader.readLine();
        done = server.logIn(email, password);

        while (!done) {
            System.out.println("Digite o e-mail: ");
            email = reader.readLine();
            System.out.println("Digite sua senha: ");
            password = reader.readLine();
            done = server.logIn(email, password);
        }

    }
}
