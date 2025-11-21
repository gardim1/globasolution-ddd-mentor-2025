INSERT INTO usuarios (nome, email, area_atuacao, nivel_carreira, data_cadastro)
VALUES
 ('Carlos Menezes', 'carlos.menezes@example.com', 'Logística', 'PLENO', CURRENT_DATE),
 ('Ana Ribeiro', 'ana.ribeiro@example.com', 'Desenvolvimento', 'JUNIOR', CURRENT_DATE),
 ('Mariana Soares', 'mariana.soares@example.com', 'RH', 'PLENO', CURRENT_DATE);

INSERT INTO trilhas (nome, descricao, nivel, carga_horaria, foco_principal)
VALUES
 ('Transição para Logística Digital',
  'Requalificação de motoristas para operações digitais.',
  'INTERMEDIARIO', 40, 'Logística & Tecnologia'),
 ('Introdução à IA para Desenvolvedores',
  'Fundamentos de IA aplicada ao futuro do trabalho.',
  'INTERMEDIARIO', 60, 'Inteligência Artificial'),
 ('Soft Skills para o Futuro do Trabalho',
  'Empatia, colaboração e comunicação em ambientes híbridos.',
  'INICIANTE', 30, 'Competências Humanas');
