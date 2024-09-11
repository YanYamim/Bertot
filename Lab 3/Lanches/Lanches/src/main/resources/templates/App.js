function addLanche() {
    const id = document.getElementById('add-id').value;
    const nome = document.getElementById('add-nome').value;
    fetch('http://localhost:8080/lanches', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ id, nome })
    })
        .then(response => response.text())
        .then(html => {
            document.getElementById('lanche-list').innerHTML = html;
            alert('Lanche adicionado com sucesso!');
        })
        .catch(error => console.error('Erro ao adicionar lanche:', error));
}

function updateLanche() {
    const id = document.getElementById('update-id').value;
    const nome = document.getElementById('update-nome').value;
    fetch(`http://localhost:8080/lanches/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ nome })
    })
        .then(response => response.text())
        .then(html => {
            document.getElementById('lanche-list').innerHTML = html;
            alert('Lanche atualizado com sucesso!');
        })
        .catch(error => console.error('Erro ao atualizar lanche:', error));
}

function deleteLanche() {
    const id = document.getElementById('delete-id').value;
    fetch(`http://localhost:8080/lanches/${id}`, {
        method: 'DELETE'
    })
        .then(response => response.text())
        .then(html => {
            document.getElementById('lanche-list').innerHTML = html;
            alert('Lanche removido com sucesso!');
        })
        .catch(error => console.error('Erro ao remover lanche:', error));
}
