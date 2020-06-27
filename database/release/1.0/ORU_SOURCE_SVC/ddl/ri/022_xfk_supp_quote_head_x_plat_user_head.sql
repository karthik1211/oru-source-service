USE ORU_SOURCE_SVC;

ALTER TABLE supplier_quote_header
ADD CONSTRAINT xfk_supp_quote_head_x_plat_user_head
FOREIGN KEY (quote_owner_id)
REFERENCES platform_user_header (platform_user_id);
