package ecologylab.bigsemantics.generated.library.patent;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class PatentClassification extends Document
{
	@simpl_scalar
	private MetadataString patentClass;

	public PatentClassification()
	{ super(); }

	public PatentClassification(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	patentClass()
	{
		MetadataString	result = this.patentClass;
		if (result == null)
		{
			result = new MetadataString();
			this.patentClass = result;
		}
		return result;
	}

	public String getPatentClass()
	{
		return this.patentClass == null ? null : patentClass().getValue();
	}

	public MetadataString getPatentClassMetadata()
	{
		return patentClass;
	}

	public void setPatentClass(String patentClass)
	{
		if (patentClass != null)
			this.patentClass().setValue(patentClass);
	}

	public void setPatentClassMetadata(MetadataString patentClass)
	{
		this.patentClass = patentClass;
	}
}
