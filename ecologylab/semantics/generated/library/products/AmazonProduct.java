package ecologylab.semantics.generated.library.products;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.library.products.Product;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  AmazonProduct.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class AmazonProduct extends Product
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString department;

	public AmazonProduct()
	{ }

	public AmazonProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	department()
	{
		MetadataString	result = this.department;
		if (result == null)
		{
			result = new MetadataString();
			this.department = result;
		}
		return result;
	}

	public String getDepartment()
	{
		return this.department().getValue();
	}

	public MetadataString getDepartmentMetadata()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department().setValue(department);
	}

	public void setDepartmentMetadata(MetadataString department)
	{
		this.department = department;
	}
}
