const containter = document.getElementById('container');
const resgisterBtn = document.getElementById('register');

const testBtn = document.getElementById('test');

const salvaBancoBtn = document.getElementById('salvar').addEventListener('click', function() {
            // Obter os valores dos campos do formulário
            const cpf = document.getElementById('cpf').value;
            const name = document.getElementById('name').value;
            const telefone = document.getElementById('telefone').value;

            // Criar um objeto com os dados do cliente
            const cliente = {
                cpf: cpf,
                name: name,
                telefone: telefone
            };

            // Fazer uma chamada POST para a API
            fetch('http://localhost:8080/clientes/create', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(cliente)
            })
            .then(response => response.json())
            .then(data => {
                console.log('Success:', data);
                // Aqui você pode adicionar lógica para mostrar uma mensagem de sucesso ou redirecionar o usuário
                alert('Cliente salvo com sucesso!');
            })
            .catch((error) => {
                console.error('Error:', error);
                // Aqui você pode adicionar lógica para mostrar uma mensagem de erro ao usuário
                alert('Erro ao salvar o cliente.');
            });
});