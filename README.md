# Como rodar?

- Utilizar o código abaixo no terminal:

```bash
javac Desafio.java
java Desafio
```

#Como testar?

- Acessar no `main` a lista de itens:

```Java
List<Produto> itens = new ArrayList<>();
```

- Para cada item que desejar adicionar, deve dar um `new Produto` e informar o nome, a quantidade e o preço:

```Java
itens.add(new Produto("nomeDoItem", quantidadeDeItens, precoDoItemEmCentavos));
```

- Além dessa, tem a lista de e-mails, que se localiza no `main` também:

```Java
List<String> emails = new ArrayList();
```

- Para cada e-mail que desejar adicionar, deve apenas utilizar `add`:

```Java
emails.add("emailQueDesejaAdicionar");
```