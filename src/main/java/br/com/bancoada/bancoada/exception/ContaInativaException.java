package br.com.bancoada.bancoada.exception;

public class ContaInativaException extends RuntimeException {

    public ContaInativaException(String mensagem) {
        super(mensagem);
    }
}
