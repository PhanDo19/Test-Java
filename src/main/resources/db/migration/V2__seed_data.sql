INSERT INTO RGON_M (RGON_CD, RGON_NM, RGON_USE_TYP, DISP_ORDER, DELETE_FLG) VALUES
('01', '北海道', '1', 1, '0'),
('02', '東北', '1', 2, '0'),
('03', '関東', '1', 3, '0'),
('99', '海外', '1', 99, '0');

INSERT INTO PREF_M (PREF_CD, PREF_NM, RGON_CD, DELETE_FLG) VALUES
('01', '北海道', '01', '0'),
('13', '東京都', '03', '0'),
('27', '大阪府', '03', '0');

INSERT INTO REF_M (REF_CD, REF_NM, REF_KN, TEL_NO, PREF_CD, RGON_CD, DELETE_FLG) VALUES
('R0001', 'サンプル問合せ先A', 'サンプルエー', '0312345678', '13', '03', '0'),
('R0002', 'サンプル問合せ先B', 'サンプルビー', '0612345678', '27', '03', '0');

INSERT INTO URL_M (REF_CD, URL_ADDR, DELETE_FLG) VALUES
('R0001', 'https://example.com/a', '0'),
('R0001', 'https://example.com/a2', '0'),
('R0002', 'https://example.com/b', '0');
