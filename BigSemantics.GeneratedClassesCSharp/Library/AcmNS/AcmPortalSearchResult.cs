//
// AcmPortalSearchResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.AcmNS 
{
	[SimplInherit]
	public class AcmPortalSearchResult : Document
	{
		[SimplScalar]
		private MetadataString authorList;

		[SimplScalar]
		private MetadataString source;

		[SimplScalar]
		private MetadataString bibliometrics;

		public AcmPortalSearchResult()
		{ }

		public AcmPortalSearchResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString AuthorList
		{
			get{return authorList;}
			set
			{
				if (this.authorList != value)
				{
					this.authorList = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Source
		{
			get{return source;}
			set
			{
				if (this.source != value)
				{
					this.source = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Bibliometrics
		{
			get{return bibliometrics;}
			set
			{
				if (this.bibliometrics != value)
				{
					this.bibliometrics = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
