USE ORU_SOURCE_SVC;

ALTER TABLE supplier_quote_attachment
ADD CONSTRAINT xfk_supp_quote_attach_x_supp_quote_head
FOREIGN KEY (supplier_quote_header_id)
REFERENCES supplier_quote_header (supplier_quote_header_id);
