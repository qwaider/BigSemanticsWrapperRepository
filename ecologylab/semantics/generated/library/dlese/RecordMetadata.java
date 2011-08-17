package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.generated.library.dlese.ItemRecord;
import ecologylab.serialization.simpl_inherit;

/**
*  RecordMetadata.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/17/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class RecordMetadata extends Metadata
{
	/** 
	 */ 
	@simpl_composite	@xml_tag("itemRecord")	@mm_name("item_record")
	private ItemRecord itemRecord;

	public RecordMetadata()
	{ }

	public RecordMetadata(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ItemRecord getItemRecord()
	{
		return itemRecord;
	}

	public void setItemRecord(ItemRecord itemRecord)
	{
		this.itemRecord = itemRecord;
	}
}
